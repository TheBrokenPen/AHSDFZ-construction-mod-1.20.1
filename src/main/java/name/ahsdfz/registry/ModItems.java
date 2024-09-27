package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TestItem = registerItem(name:"TestItemString",
        new Item(new FabricItemSettings()));



    public static Item registerItem(String name, Item item, RegistryKey<ItemGroup>...itemGroups) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(AHSDFZConstructionMod.MOD_ID, name), item);
        for (RegistryKey<ItemGroup> itemGroup: itemGroups) {
            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> entries.add(registeredItem));
        }
        return registeredItem;
    }
    public static void registerModItems() {
        AHSDFZConstructionMod.LOGGER.debug("Registering mod items for" + AHSDFZConstructionMod.MOD_ID);
    }
}

