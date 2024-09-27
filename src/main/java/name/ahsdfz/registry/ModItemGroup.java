package name.ahsdfz.registry;

import name.ahsdfz.AHSDFZConstructionMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup TestItem1 = FabricItemGroup.builder(new Identifier(AHSDFZConstructionMod.MOD_ID, "test_itemgroup"))
            .displayName(Text.translatable("itemgroup.ahsdfz-construction-mod.TestItem"))
            .icon(() -> new ItemStack(ModItems.TestItem1))
            .build();

    public static void registerModItemGroup() {
        AHSDFZConstructionMod.LOGGER.debug("Registering mod item group for" + AHSDFZConstructionMod.MOD_ID);
    }
}

