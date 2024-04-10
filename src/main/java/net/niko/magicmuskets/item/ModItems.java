package net.niko.magicmuskets.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.niko.magicmuskets.MagicMuskets;

public class ModItems {
    public static final Item MUSKET = registerItem("musket",new Item(new FabricItemSettings()));

    private static void AddItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(MUSKET);


    }


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(MagicMuskets.MOD_ID,name), item);
    }

    public static void registerModItems() {
        MagicMuskets.LOGGER.info("Registering Mod Items for " + MagicMuskets.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::AddItemsToIngredientItemGroup);


    }
}