debogage
========

Utilisation de techniques de debogage (tests unitaires, couverture de code et vérification de règles de codage).

======== Tests unitaires =========

Le but de cette partie est d'écrire un programme de test pour la classe https://github.com/charroux/debogage/blob/master/src/main/java/com/univ/Testing/Compte.java

Toutes les méthodes de cette classe doivent être testées.

Une ébauche du programme de test a été écrit dans la classes https://github.com/charroux/debogage/blob/master/src/test/java/com/univ/Testing/TestingApplicationTests.java

Ce programmme utilise JUint.

Ce projet utilise Gradle qui doit être installé sur votre machine ainsi que Java.

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

