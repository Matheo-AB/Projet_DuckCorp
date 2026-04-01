**Question (Ex1) :** Une méthode default dans une interface peut-elle accéder aux champs privés de la classe qui l'implémente ? Justifiez, en vous appuyant sur isDefective() dans Qualifiable et getQualityScore() dans Duck.

- Une interface ne peut pas accéder aux champs privés de la classe qui l'implémente. Par exemple pour la méthode isDefective(), elle ne peut pas lire le champ qualityScore qui sera stocké dans Duck. pour getQualityScore(), même chose.

**Question (Ex2) :** Dans ce projet, Maintainable est une interface et Machine est une classe abstraite. Quelle règle Java vous aurait empêché de faire l'inverse (rendre Maintainable abstraite et Machine une interface) ? Plus généralement, quand choisit-on une interface plutôt qu'une classe abstraite ?

- La règle limitante est l'héritage simple : en Java, une classe ne peut hériter que d'une seule classe (abstraite ou non). Si Maintainable était une classe abstraite, une Machine ne pourrait pas hériter à la fois de ses propriétés de maintenance et d'une autre classe de base.

**Critères :**

- Classe abstraite (Machine) : On la choisit pour partager du code et un état (des champs comme condition, capacity). Elle définit ce que l'objet est.

- Interface (Maintainable) : On la choisit pour définir une capacité ou un comportement que plusieurs classes, potentiellement issues de hiérarchies différentes, peuvent partager. Elle définit ce que l'objet peut faire.