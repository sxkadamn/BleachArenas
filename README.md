# 🌟 BleachArenas

BleachArenas is a powerful Minecraft plugin inspired by the anime "Bleach," bringing epic battles, unique abilities, and competitive arenas to your server! 🏆⚔️

## 🚀 Features

- 🏯 **Custom Arenas** – Battle in iconic Bleach-themed arenas
- ⚡ **Unique Abilities** – Master powerful techniques like Shikai & Bankai
- 🎭 **Character Classes** – Choose from different Bleach-inspired playstyles
- 🔄 **Flexible Configuration** – Customize arenas, skills, and game mechanics

## 📥 Installation

1. Download the latest version from [Releases](https://github.com/sxkadamn/BleachArenas/releases).
2. Move `BleachArenas.jar` to your server's `plugins` folder.
3. Restart your server.
4. Customize the configuration in `plugins/BleachArenas/config.yml` as needed.

## 🎮 Commands

| Command                       | Description                               |
|-------------------------------|-------------------------------------------|
| `/arena create <name>`        | Create a new arena with the specified name |
| `/arena delete <name>`        | Delete the arena with the specified name  |
| `/arena join <name>`          | Join the specified arena                  |
| `/arena leave`                | Leave the current arena                   |
| `/arena list`                 | List all available arenas                 |
| `/arena setspawn <arena>`     | Set the spawn point for the specified arena |
| `/arena start <arena>`        | Force start the specified arena           |
| `/arena stop <arena>`         | Force stop the specified arena            |
| `/arena reload`               | Reload the plugin configuration           |

## ⚙️ Configuration (`config.yml`)

Customize your game settings in the configuration file:

```yaml
arena:
  game:
    scoreboard:
      title: "&6Счётчик очков"
      lines:
        - ''
        - '&cГотей 13 - &4%bleach_gotei_scores% &7/ &b&%bleach_max_scores%'
        - ''
        - '&9Эспада - &9%bleach_espada_scores%&7/ &b&%bleach_max_scores%'
  gui:
    lore:
      - ''
      - '&6----'
      - '&cГотей 13 - &4%gotei_team &7/ &4%gotei_max'
      - '&6----'
      - '&9Эспада - &9%espada_team &7/ &9%espada_max'
      - ''
```

## 📌 Requirements

- Minecraft 1.16+
- Spigot/Paper server
- Java 8+

## 🛠️ Contributing

Want to help improve BleachArenas? Fork the repository, make your changes, and submit a Pull Request!

## ❓ Need Help?

Have questions or suggestions? Open an issue in the [repository](https://github.com/sxkadamn/BleachArenas/issues)!

---

🔹 **Developer:** sxkadamn

💥 Get ready for the ultimate Bleach battle experience! 🔥









