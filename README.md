debogage
========

Utilisation de techniques de debogage (tests unitaires, couverture de code et vérification de règles de codage)

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

