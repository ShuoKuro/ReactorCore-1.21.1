# ReactorCore-1.21.1

A Minecraft 1.21.1 mod adding nuclear energy mechanics, including reactors, fuels, and safety tools.

## Development Status
I'm currently working on it to make the mod playable with basic nuclear functionality.
The focus is on a simple fission reactor system: mining resources → crafting fuel → assembling a small reactor → generating power (Forge Energy/FE) → handling waste and radiation.

#### Items (4 in total):
- **Raw Uranium**:
  Crushed from ore. smelts it into uranium ingots.
  
- **Uranium Ingot**:
  smelted from ore. Intermediate crafting material, used to make fuel rods

- **Empty Fuel Rod**: 
  Crafted from iron ingots. Intermediate crafting material, used to make fuel rods
  
- **Uranium Fuel Rod**:
  Crafted from ingots with Empty Fuel Rod. inserted into reactor to generate heat or energy.

#### Blocks (3 in total):
- **Uranium Ore**:
  Mined underground. Spawns in overworld like gold, mined them turn into raw uranium.
  
- **Reactor Frame** :
iron-based blocks forming the reactor's outer shell.

- **Reactor Core**:
Central controller block.

### Expected Mechanics
- **Assembly**: Build 3x3x3 structure with frames around internals; auto-detects formation.
- **Operation**: Insert fuel/control rods, add water; reactor produces power but risks overheating (damage blocks) or radiation (hurts players without suit).
  
### **Next Steps**
- Haven't decided yet!!

Contributions welcome! See issues for bugs or ideas.
