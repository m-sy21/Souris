# Simulation Multi-Agents de Souris sur Grille 2D

Projet de Génie Logiciel et Projet (GLP) — Licence 2 Informatique
CY Cergy Paris Université — Année universitaire 2025-2026

**Encadrant** : M. Tianxiao LIU

**Autrices** : SIMYA Meriem, LAIFAOUI Ines, ANOUD Salma

---

## Prérequis

- Java (JDK) 1.8 (Java 8)
- Eclipse IDE (toute version récente)
- Les 5 librairies fournies par M. Liu (à placer dans un dossier `libs/`) :
  - `log4j-1.2.17.jar`
  - `jfreechart-1.0.19.jar`
  - `jcommon-1.0.23.jar`
  - `junit-4.11.jar`
  - `hamcrest-core-1.3.jar`

> **ATTENTION** : compiler avec Java 11+ provoque une erreur « StringConcatFactory cannot be resolved ». Les fichiers `.classpath` et `.settings/` inclus règlent cela automatiquement.

---

## Lancement sous Eclipse

1. `File` → `Import` → `General` → `Existing Projects into Workspace`
2. Sélectionner le dossier `src/` (celui qui contient le fichier `.project`)
3. Cliquer sur `Finish`
4. Ajouter les librairies externes :
   - Créer un dossier `libs/` à la racine du projet
   - Y copier les 5 fichiers `.jar` ci-dessus
   - Clic droit sur le projet → `Build Path` → `Configure Build Path`
   - Onglet `Libraries` → `Add JARs` → sélectionner les 5 JARs
5. Vérifier la version Java :
   - Clic droit sur le projet → `Properties` → `Java Build Path`
   - Le `JRE System Library` doit être `JavaSE-1.8`
   - Si besoin : `Libraries` → `JRE System Library` → `Edit` → sélectionner Java 8
6. Lancer le programme :
   - Ouvrir `src/gui/MainGUI.java`
   - Clic droit → `Run As` → `Java Application`

---

## Lancer les tests JUnit

- Ouvrir `src/test/TestSuiteAll.java`
- Clic droit → `Run As` → `JUnit Test`

---

## Structure du projet

```
src/
  config/          Configuration.java (constantes globales)
  engine/map/      Grille.java, Case.java
  engine/mobile/   Souris, Nourriture, Obstacle, Memoire, interactions...
  engine/process/  Environnement (moteur), GameBuilder, MobileInterface
  gui/             MainGUI, GameDisplay, StatsPanel, JournalFenetre, PaintStrategy
  log/             LoggerUtility.java, log4j-text.properties, log4j-html.properties
  resources/       Sprites PNG (souris, nourriture, obstacles, trésor)
  test/            TestSouris, TestInteractions, TestEnvironnement, TestGame, TestSuiteAll

doc/               Code source LaTeX du rapport
Rapport_SIMYA_LAIFAOUI_ANOUD.pdf
readme.md
```

---

## Utilisation

Au démarrage, un écran de paramétrage s'affiche. Régler les valeurs avec les boutons `[-]` `[+]`, puis cliquer sur « Lancer la simulation ».

Boutons disponibles pendant la simulation :

- **Démarrer / Pause** : contrôler la simulation
- **Réinitialiser** : repartir à zéro
- **Vitesse+ / Vitesse-** : accélérer ou ralentir
- **+Souris, +Male, +Femelle** : ajouter des souris
- **+Nourriture** : ajouter une nourriture aléatoire (fromage, graines ou pomme)
- **+Obstacle** : ajouter un obstacle aléatoire

Cliquer sur une souris dans la grille ouvre son journal intime.

Les logs sont générés automatiquement dans `log/` à chaque exécution :

- `souris-log.txt` : journal texte
- `souris-log.html` : journal HTML coloré
