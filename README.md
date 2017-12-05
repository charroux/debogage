debogage
========

Utilisation de techniques de debogage (tests unitaires, couverture de code et vérification de règles de codage).

======== Tests unitaires =========

Le but de cette partie est d'écrire un programme de test pour la classe https://github.com/charroux/debogage/blob/master/src/main/java/com/univ/Testing/Compte.java

Toutes les méthodes de cette classe doivent être testées.

Une ébauche du programme de test a été écrit dans la classes https://github.com/charroux/debogage/blob/master/src/test/java/com/univ/Testing/TestingApplicationTests.java

Ce programmme utilise JUint.

======== Téléchargement du projet =========

Utilisez le bouton dowload accessible à partir de la page principale de ce projet pour télécharger ce projet, ou utilisez les commandes git.

======== Build du projet =========

Ce projet Java utilise Gradle, un outil qui permet de gérer les librairies telles que JUnit. Pour builder le projet il faut utiliser la commande 

./gradlew build			sous Linux

ou

/gradlew build			sous Windows

le premier lancement de cette commande prend du temps car un exécutable de Gradle est téléchargé.

======== Consultation du rapport de test =========

Le build du projet s'est terminé par le lancement automatique du programme de test JUnit. Le rapport HTML de test est accessible dans le dossier build/reports/tests/test. Il vous indique que les deux tests du programme de test ont réussi. Ainsi il vous suffira de refaire la commande gradle build pour relancer à tout moment les tests.

======== Edition du projet sous Eclipse (optionnel) =========

Cette partie utilise Eclipse mais vous pouvez aussi bien utiliser n'importe que éditeur pour éditer le programme à tester et le programme de test.

Avant d'éditer le projet sous Eclipse, il faut convertir le projet gradle en un projet eclipse via la commande

./gradlew eclipse		sous Linux

ou

/gradlew eclipse		sous Windows

Vous pouvez alors importer le projet sous Eclipse via le menu : File -> Import -> Existing project into workspage ...


Ce projet utilise Gradle qui doit être installé sur votre machine ainsi que Java.
viz
Construire le projet avec la commande : gradle build

Consulter le rapport de test dans le sous-dossier : build\reports\test 

Faire une vérification de la couverture de test en utilisant le plugin Jacoco :

- ajouter au fichier build.gradle :

apply plugin: 'jacoco'

test {
    systemProperties 'property': 'value'
}

jacocoTestReport {
    reports {
        xml.enabled false
        csv.enabled false
        html.destination "${buildDir}/jacocoHtml"
    }
}

- lancer Jacoco avec la commande :  gradle test jacocoTestReport

- consulter le rapport de test dans le sous dossier : build\jacocoHtml

Analyse statique de code soure avec findBugs :

- ajouter au fichier build.gradle :

apply plugin: 'findbugs'

findbugs {
	effort = "max"
	reportLevel = "high"
}

- lancer findBugs : gradle findbugsMain

- analyser le rapport qui se trouve dans le sous-dossier build\reports\findBugs

