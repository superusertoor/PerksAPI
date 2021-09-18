package perks;

import events.PerkDisableEvent;
import events.PerkEnableEvent;
import handler.PerkHandler;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;
import java.util.List;

public class Perk {

    private int amplifier;
    private String name;
    private List<String> description;
    private PotionEffectType potionEffectType;
    private Material material;

    public Perk() {
        this.potionEffectType = PotionEffectType.JUMP;
        this.name = "Perk";
        this.amplifier = 0;
        this.description = Arrays.asList("No description set.");
        this.material = Material.PAPER;
        PerkHandler.add(this);
    }

    public void activate(PerkPlayer perkPlayer) {
        perkPlayer.bukkit().addPotionEffect(new PotionEffect(potionEffectType, 356000, amplifier));
        perkPlayer.setPerkEnabled(this);
        Bukkit.getPluginManager().callEvent(new PerkEnableEvent(perkPlayer, this));
    }

    public void deactivate(PerkPlayer perkPlayer) {
        perkPlayer.bukkit().removePotionEffect(potionEffectType);
        perkPlayer.setPerkDisabled(this);
        Bukkit.getPluginManager().callEvent(new PerkDisableEvent(perkPlayer, this));
    }

    public Perk setMaterial(Material material) {
        this.material = material;
        return this;
    }

    public PotionEffectType getPotionEffectType() {
        return potionEffectType;
    }

    public Perk setPotionEffectType(PotionEffectType effectType) {
        this.potionEffectType = effectType;
        return this;
    }

    public List<String> getDescription() {
        return description;
    }

    public Perk setDescription(String... description) {
        this.description = Arrays.asList(description);
        return this;
    }

    public Perk setDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public Perk setName(String name) {
        this.name = name;
        return this;
    }

    public ItemStack toItemStack() {
        return new ItemHandler(material).setDisplayName(name).setLore(description).create();
    }

    private int getAmplifier() {
        return amplifier;
    }

    public Perk setAmplifier(int amplifier) {
        this.amplifier = amplifier;
        return this;
    }
}