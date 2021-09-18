package perks;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class ItemHandler {

    private ItemStack itemStack;
    private ItemMeta itemMeta;

    public ItemHandler(Material material, short subID) {
        this.itemStack = new ItemStack(material, 1, subID);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    public ItemHandler(Material material) {
        this(material, (short) 0);
    }

    public ItemHandler setDisplayName(String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }

    public ItemHandler setAmount(int amount) {
        this.itemStack.setAmount(amount);
        return this;
    }

    public ItemHandler addEnchant(Enchantment enchantment, int level, boolean Boolean) {
        this.itemMeta.addEnchant(enchantment, level, Boolean);
        return this;
    }

    public ItemHandler setLore(String... lore) {
        this.itemMeta.setLore(Arrays.asList(lore));
        return this;
    }

    public ItemHandler setLore(List<String> lore) {
        this.itemMeta.setLore(lore);
        return this;
    }

    public ItemHandler setUnbreakable(boolean Boolean) {
        this.itemMeta.setUnbreakable(Boolean);
        return this;
    }

    public ItemHandler setColor(short color) {
        this.itemStack.setDurability(color);
        return this;
    }

    public ItemHandler hideEnchantments() {
        this.itemMeta.addItemFlags(new ItemFlag[]{ItemFlag.HIDE_ENCHANTS});
        return this;
    }

    public ItemStack create() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }
}
