package com.moyas1009.fatemod.init;

import java.util.ArrayList;
import java.util.List;

import com.moyas1009.fatemod.blocks.AltarBlock;
import com.moyas1009.fatemod.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ALTAR_BLOCK = new AltarBlock("altar_block", Material.ROCK);

}
