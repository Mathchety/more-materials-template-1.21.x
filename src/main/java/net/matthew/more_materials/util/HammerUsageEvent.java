package net.matthew.more_materials.util;

import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.matthew.more_materials.item.custom.HammerItem;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;

public class HammerUsageEvent implements PlayerBlockBreakEvents.Before{

    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity) {

        ItemStack mainHandleItem = player.getMainHandStack();

        if (mainHandleItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayerEntity serverPlayer){
            if (HARVESTED_BLOCKS.contains(pos)){
                return true;
            }

            for (BlockPos position : HammerItem.getBlockToBeDestroyed(1, pos, serverPlayer)){
                if (pos == position || !hammer.isCorrectForDrops(mainHandleItem, world.getBlockState(position))){
                    continue;
                }

                HARVESTED_BLOCKS.add(position);
                serverPlayer.interactionManager.tryBreakBlock(position);
                HARVESTED_BLOCKS.remove(position);
            }
        }

        return true;
    }
}
