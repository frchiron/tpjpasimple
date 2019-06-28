# Exemple d'un projet avec JPA


## Prequis
 * Java 8 +
 * Maven 3 +
 * Intellij


## Les Etapes

* Ajouter une classe Book avec les champs Id et Title (et les constructeur/getter/setter)

* Définir cette classe comme une Entité et indiquer la stratégie de génération des identifiants : GenerationType.AUTO


* Dans persistence.xml indiquer que le provider pour JPA est Hibernate
* Référencer l'entité Book dans persistence.xml

* Indiquer un chemin pour la base local H2 (propriété hibernate.connection.url)

* Créer dans le Main de la classe MonPremierJPA un entityManager référençant la `persistence-unit` définie dans persistence.xml

* Créer dans le Main une nouvelle instance de Book (avec un titre)

* Enregistrer le book en base et afficher l'id généré
