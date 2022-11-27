package fr.akinaru.familiermanager;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;

public enum EntityManager {

    CHICKEN("Poulet", EntityType.CHICKEN, Material.COOKED_CHICKEN, 10, "§cPoulet", 1.6),
    BLAZE("Blaze", EntityType.BLAZE, Material.BLAZE_POWDER, 12, "§eBlaze", (double)2),
    WITHER("Wither", EntityType.WITHER, Material.SOUL_SAND, 13, "§7Wither", (double)0.6),
    SHEEP("Mouton", EntityType.SHEEP, Material.WOOL, 14, "§2Mouton", 2.2),
    SQUID("Poulpe", EntityType.SQUID, Material.INK_SACK, 15, "§bPoulpe", (double)2),
    COW("Vache", EntityType.COW, Material.COOKED_BEEF, 11, "§6Vache", 2.2);

    private final String name;
    private final EntityType entityType;
    private final Material guiMaterial;
    private final int guiPlace;
    private final double speed;
    private final String guiName;

    EntityManager(String name,EntityType entityType, Material guiMaterial, int guiPlace, String guiName, Double speed){
        this.name = name;
        this.entityType = entityType;
        this.guiMaterial = guiMaterial;
        this.guiPlace = guiPlace;
        this.guiName = guiName;
        this.speed = speed;
    }


    public String getName() {

        return name;
    }


    public EntityType getEntityType() {
        return entityType;
    }

    public Material getGuiMaterial() {
        return guiMaterial;
    }

    public int getGuiPlace() {
        return guiPlace;
    }

    public String getGuiName() {
        return guiName;
    }

    public double getSpeed() {
        return speed;
    }
}
