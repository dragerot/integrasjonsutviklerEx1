# integrasjonsutviklerEx1

Dette er en uferdig løsning, men jeg har valgt å brukel Camel rammeverket til å løse oppgaven.


Det mangler et rest grensesnitt, men to Soap kontrakter er blitt etablert for 

-opprette en kunde (fagsystem), 
-opprette en avtale (fagsystem)
-sende avtale til kunde (Integrasjonsoppgaven)

Se https://github.com/dragerot/integrasjonsutviklerEx1/tree/master/src/main/java/integrasjon/service

Jeg har i løsningen for å forenkle valgt å legge fagsystemet i integrasjonsløsningen og et etablert soap grensesnitt inne i samme løsning.

Oppdatere status mangler implementering.

Ingen tester er etablert. Her er måle å opprette en rest integrasjonstest, Camel rutetester og enhetstester med JUnit.

og Camel ruten classen

"https://github.com/dragerot/integrasjonsutviklerEx1/blob/master/src/main/java/integrasjon/route/KundeAvtaleIntegrasjonRoute.java"

O blokk "from("direct:csl:opprettKundeAvtale").routeId("csl:oppretteKundeAvtale")."

skal orkistrere operasjoner med å 

-opprette en kunde, 
-opprette en avtale
-sende avtale til kunde
-oppdatere status
-returnere resultat

