# integrasjonsutviklerEx1

Dette er en uferdig løsning, men jeg har valgt å brukel Camel rammeverket og CXF Jax-rs og Jax-ws implementasjonene til å løse oppgaven. Jeg brukte Camel rammeverket i min jobb i If, og mye er farget av dette i mitt løsningsforslag. 

Jeg er interessert i Spring Boot, og kunne konfigurert opp med mindre konfigurasjonskode. Men jeg har ikke fått prøvd ut CXF, så jeg valgte meg bort fra dette.


Synlige Mangler:

* Oppdatere status mangler implementering.
* Ingen tester er etablert. Her er måle å opprette en rest integrasjonstest, Camel rutetester og enhetstester med JUnit.
* request ident burde defineres i alle grensesnitt mht logging
* prosessgang må utbedres for å få en robust flyt.


Forenklinger:

Jeg har i løsningen for å forenkle valgt å legge fagsystemet i integrasjonsløsningen og et etablert soap grensesnitt inne i samme løsning. 



Hva som er gjort:

Datastrukturer (domene) for å definere integrasjonskontrakter er laget. 
Feilhandtering er etablert (Fault).
Det mangler et rest grensesnitt, men to Soap kontrakter er blitt etablert for 

* opprette en kunde (fagsystem)
* opprette en avtale (fagsystem)
* sende avtale til kunde (Integrasjonsoppgaven)

Kontrakter er definert her: https://github.com/dragerot/integrasjonsutviklerEx1/tree/master/src/main/java/integrasjon/service


Camel ruteclassen 

"https://github.com/dragerot/integrasjonsutviklerEx1/blob/master/src/main/java/integrasjon/route/KundeAvtaleIntegrasjonRoute.java"

og camel blokk 

"from("direct:csl:opprettKundeAvtale").routeId("csl:oppretteKundeAvtale")."

skal prosessere  

* opprette en kunde, 
* opprette en avtale
* sende avtale til kunde
-oppdatere status
* returnere resultat

