debogage
========

Utilisation de techniques de debogage (tests unitaires, couverture de code et vérification de règles de codage).

======== Tests unitaires =========

Le but de cette partie est d'écrire un programme de test pour la classe https://github.com/charroux/debogage/blob/master/src/main/java/com/univ/Testing/Compte.java

Toutes les méthodes de cette classe doivent être testées.

Une ébauche du programme de test a été écrit dans la classes https://github.com/charroux/debogage/blob/master/src/test/java/com/univ/Testing/TestingApplicationTests.java

Ce programmme utilise JUnit (voir le cours).

======== Téléchargement du projet =========

Utilisez le bouton dowload accessible à partir de la page principale de ce projet pour télécharger ce projet, ou utilisez les commandes git.

======== Build du projet =========

Ce projet Java utilise Gradle, un outil qui permet de gérer les librairies telles que JUnit. Pour builder le projet il faut utiliser la commande 

./gradlew build			

sous Linux (attention ! parfois le fichier gradlew n'est pas exécutable. Dans ce cas, il faut exécuter la commande : chmod 777 gradlew)

ou

gradlew build			

sous Windows. 

Le premier lancement de cette commande prend du temps car un exécutable de Gradle est téléchargé.

Cette commande commnence par compiler le code Java, lance automatiquement le programme de test. 

======== Consultation du rapport de test =========

Le build du projet s'est terminé par le lancement automatique du programme de test JUnit. Le rapport HTML de test est accessible dans le dossier build/reports/tests/test. Il vous indique que les deux tests du programme de test ont réussi. Ainsi il vous suffira de refaire la commande gradle build pour recompiler votre projet et relancer à tout moment les tests.

======== Edition du projet sous Eclipse (optionnel) =========

Cette partie utilise Eclipse mais vous pouvez aussi bien utiliser n'importe quel éditeur pour éditer le programme à tester et le programme de test.

Avant d'éditer le projet sous Eclipse, il faut convertir le projet gradle en un projet eclipse via la commande

./gradlew eclipse		

sous Linux ou

gradlew eclipse		

sous Windows.

Vous pouvez alors importer le projet sous Eclipse via le menu : File -> Import -> Existing project into workspage ...

Attention cependant, Eclipse va sous servir uniquement à éditer les programmes, mais pas à exécuter les tests.

======== Codage =========

Terminer l'écriture du programme https://github.com/charroux/debogage/blob/master/src/main/java/com/univ/Testing/Compte.java

Remarque : si vous ne vous sentez pas  à l'aise avec les exceptions vous pouvez les effacer.

======== Ecriture du programme de test =========

Compléter le programme de test https://github.com/charroux/debogage/blob/master/src/test/java/com/univ/Testing/TestingApplicationTests.java
afin de tester la classe de la classe de la question précédente.

Lancer les tests via gradle build et corriger la classe a tester jusqu'à ce qu'il n'y ait plus de bugs. Attention cependant ! si vous avez des erreurs de compilation, le build échouera. Un message d'erreur s'affichera. Vous devrez alors corriger le problème de compilation avec que le build réussisse.

======== Couverture de code avec Jacoco =========

Le projet est configuré pour effectuer des tests de couverture de code. 

Pour lancer les tests de couverture utilisez la commande : ./gradlew test jacocoTestReport

Le rapport de test HTML est dans le dossier build/jacocoHtml.

Jacoco vérifie la couverture de code C0 (instructions) et C1 (branches). Vérifier que votre code est couvert à 100%. Si ce n'est pas la cas ajoutez des tests à votre programme de test.

======== Analyse statique du code source Java avec findBugs ============

findBugs est un outils qui permet de détecter des erreurs de codage via une analyse statique des programmes (voir le cours).

Le lancement de findBugs se fait via la commande :

./gradlew findbugsMain

sous Linux, ou 

gradlew findbugsMain

sous Windows.

La rapport de test (en XML) est généré dans le dossier build/reports/findbugs/main.xml.

L'analyse du rapport est un peu fastidieuse. Il faut repérer les balises BugInstance. Voilà un exemple :

<BugInstance type="URF_UNREAD_FIELD" priority="2" rank="18" abbrev="UrF" category="PERFORMANCE">
  
Pour savoir à quel bug cela correspond il faut chercher sur le site de findbugs : http://findbugs.sourceforge.net/bugDescriptions.html

En l'occurence le site indique :

UrF: Unread field (URF_UNREAD_FIELD)

This field is never read.  Consider removing it from the class.

On peut aussi choisir le niveau de seuil de findbugs. Pour fixer le seuil à la valeur la plus stricte il faut changer la configuration de findbugs dans le fichier build.gradle comme suit :

findbugs {

	toolVersion = "3.0.1"

	effort = "max"
	
	reportLevel = "low"
	
}
