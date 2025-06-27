package net.matthew.more_materials.item.custom;

import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends MiningToolItem {
    public HammerItem(ToolMaterial material, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE, settings);
    }

    public static List<BlockPos> getBlockToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayerEntity player){
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20, 0, false);
        if (hit.getType() == HitResult.Type.BLOCK){
            BlockHitResult blockhit = (BlockHitResult) hit;

            if(blockhit.getSide() == Direction.DOWN || blockhit.getSide() == Direction.UP) {
                for (int x = -range; x <= range; x++){
                    for (int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY(), initialBlockPos.getZ() + y));
                    }
                }
            }

            if(blockhit.getSide() == Direction.NORTH || blockhit.getSide() == Direction.SOUTH) {
                for (int x = -range; x <= range; x++){
                    for (int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX() + x, initialBlockPos.getY() + y, initialBlockPos.getZ()));
                    }
                }
            }

            if(blockhit.getSide() == Direction.EAST || blockhit.getSide() == Direction.WEST) {
                for (int x = -range; x <= range; x++){
                    for (int y = -range; y <= range; y++){
                        positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY() + y, initialBlockPos.getZ() + x));
                    }
                }
            }
        }
        return positions;
    }
}
