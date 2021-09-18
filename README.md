PerksAPI
Register listener PerkJoinListener to cache PerkPlayers

Events
 PerkEnableEvent
     - getPerk(); - returns Perk
     - getPerkPlayer(); - returns PerkPlayer
     
 PerkDisableEvent
    - getPerk(); - returns Perk
    - getPerkPlayer(); - returns PerkPlayer

PerkHandler
  - getPerkPlayer(Player); - returns a PerkPlayer
  - removePerkPlayer(PerkPlayer); - removes a PerkPlayer
  - addPerkPlayer(PerkPlayer); - caches a PerkPlayer
  - add(Perk); - registers a Perk
  - remove(Perk); - removes a Perk
  - getPerks(); - returns Perks
  
Perk
  - setMaterial(Material); - sets Perk's material
  - toItemStack(); - returns itemstack
  - setPotionEffectType(PotionEffectType); - sets potioneffecttype
    - getPotionEffectType(); - returns effecttype
  - setName(String); - sets name
    - getName(); - returns name
  - setDescription(String...); - sets description
  - setDescription(List<String>); - sets description
    - getDescription(); returns description
  - setAmplifier(int); - sets amplifier
    - getAmplifier(); - returns amplifier
  
Creating a custom Perk (Example perk in example/)
- Perk perk = new YourCustomPerk();
- Override method 'activate' and 'deactivate'
  
PerkPlayer
  - addPerk(Perk); - adds a perk to player's collection
  - removePerk(Perk); - removes perk from player's collection
  - setPerkEnabled(Perk); - sets a perk enabled (do not confound with activate!)
  - setPerkDisabled(Perk); - sets a perk disabled (do not confound with deactivate!)
  - getPerks(); - returns all player's perks
  - getEnabledPerks(); - returns player's enabled perks
  - bukkit(); - returns Player
