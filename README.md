# integrasjonsutviklerEx1


Synlige Mangler:

*Dette er en uferdig løsning, men jeg har valgt å brukel Camel rammeverket til å løse oppgaven. 
*Oppdatere status mangler implementering.
*Ingen tester er etablert. Her er måle å opprette en rest integrasjonstest, Camel rutetester og enhetstester med JUnit.
*request ident burde defineres i alle grensesnitt mht logging
*prosessgang må utbedres for å få en robust flyt.


Forenklinger:

Jeg har i løsningen for å forenkle valgt å legge fagsystemet i integrasjonsløsningen og et etablert soap grensesnitt inne i samme løsning. 



Hva som er gjort:

Datastruktur for å definere integrasjonskontrakt er laget. 
Feilhandtering er etablert (Fault).
Det mangler et rest grensesnitt, men to Soap kontrakter er blitt etablert for 

-opprette en kunde (fagsystem), 
-opprette en avtale (fagsystem)
-sende avtale til kunde (Integrasjonsoppgaven)

Kontrakter er definert her: https://github.com/dragerot/integrasjonsutviklerEx1/tree/master/src/main/java/integrasjon/service

Camel ruten classen 

"https://github.com/dragerot/integrasjonsutviklerEx1/blob/master/src/main/java/integrasjon/route/KundeAvtaleIntegrasjonRoute.java"

og camel blokk "from("direct:csl:opprettKundeAvtale").routeId("csl:oppretteKundeAvtale")."

skal orkistrere operasjoner med å 

-opprette en kunde, 
-opprette en avtale
-sende avtale til kunde
-oppdatere status
-returnere resultat

