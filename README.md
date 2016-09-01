# integrasjonsutviklerEx1

Dette er en uferdig løsning, men jeg har valgt å brukel Camel rammeverket til å løse oppgaven.
Det mangler et rest grensesnitt, men et Soap grensesnitt er blitt etablert. oppdatere status mangler
implementering. Jeg har i løsningen valgt å legge fagsystem webservice inne i samme løsning.

Ingen tester er etablert. Her er måle å opprette en rest integrasjonstest, Camel rutetester og enhetstester med JUnit.

Og Camel ruten classen

"https://github.com/dragerot/integrasjonsutviklerEx1/blob/master/src/main/java/integrasjon/route/KundeAvtaleIntegrasjonRoute.java"

O blokk "from("direct:csl:opprettKundeAvtale").routeId("csl:oppretteKundeAvtale")."

skal orkistrere operasjoner med å 

-opprette en kunde, 
-opprette en avtale
-sende avtale til kunde
-oppdatere status
-returnere resultat

