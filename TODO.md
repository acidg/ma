# 18.07.2017
## Normalisierung:
* methodenbasiert?
* nur kommentare entfernen?
* Identifier belassen?

## Rechtliches
Ab wann ist es Infringement? Beispiele von Verletzungen

## Related
* Plagiatcheck für Master-/Doktorarbeiten
* Firmen für License Infringement Checks

## Größenordungen:
* Brauchts einen Server oder passt DB auf Client? 
* Multistage: erst grob, dann feinere Anfragen
* Versionierung: Commit oder nur major/Akutuelle Versionen

## Next
* Plagiatsoftware: ohne übertragung des Textes, evtl: https://plagiarismcheckerx.com/
* Token capable of Code insertion?
* Dependency Graph based?
* Method + graph based
* Usecase?: https://academia.stackexchange.com/questions/38975/ => codesuche

# 01.08.2017
* eher ganze Files kopiert
* Copy paste papers: Clone detection, large scale clone detection
* Firmen für Licence infringements? Blackduck, http://www.flexerasoftware.de/enterprise/products/software-vulnerability-management/flexnet-code-insight/
* Copy/Move: Paper Dani
* Oracle vs google android java api, tyson tv linux kernel code
* Konzentration auf index bauen
* wie groß wird index? geht kleine clone detection noch, oder schon file basiert? hochrechnen.
* Änderungen im code. Index dazu? Wie robust
* koschke: liste glp lizensierter code
* Welche sprachen? c/c++ erst mal, dann evtl java (hauptsächlich server code)
* github torrent
* apache lizenz auschecken
* nicht nur wegen lizenz, auch lieber lib verlinken

## Next
* GHTorrent, keine Info über Lizenz
* Abschätzen:
* Secold: Internet-Scale Code Search; "Linked-Data", Metadaten ???; Down? https://twitter.com/secold Down?; v1 ~70GB bei 18000 Java open source projekten
* Multilevel Index paper: 2-9 mal schneller als TS, 32-bit index statt 128-bit + ???
* Vorgehen: Formatting, Normalisierung, FLS-Hashing, sort, TLS-Hashing 
* Commit based? Implementierung? Ausprobieren: Linux kernel, ohne dann mit commits

# 08.08.2017
* Albert: Implementierung
* Platz?
* Dauer?
* Datentransfer Client <-> Server? -> Evaluierung

## Next
* Normalisierung: Ids verursacht viele collisions

# 30.08.2017
* Methodenbasiert?
* Historie analysieren, commit based?
* Db zum Kunden? Kunde sendet hashes?
* Datenübertragung Client->Server Multistage?

## Next
* Viele Clone => egal, später filtern + evtl. beim Indexieren Duplikate in gleichem File auslassen?
* Historie Analysieren: 
* Datenübertragung: File Normalisieren, Hashes kürzen, opt. Hashes mischen, Block an Server übertragen, Response: genauere Hashes mit entsprechenden Locations

# 14.09.2017
* History weiter analysieren

## Next
* History implementiert, Problem: zu viele Commits, macht wenig Sinn, weil kleine Änderungen 

# 02.10.2017
* 2nd level HashIndex für schnelleren Lookup
* Projekte scannen und auf clones untersuchen

## Next
* HashIndex aufgebaut, Datenbank wird zu groß für RAM
* Projekte gescannt, nichts gefunden, codebases anfragen?
* Postgres/MySQL probiert, zu langsam, trotz batch insert (für Linux mehrere Tage)
* 

# 09.10.2017
* Größenordung? 100 Projekte?
* 
 ## Next
* Kleinere Chunks (momentan , mehr Matches => Höhere Wahrscheinlichkeit => Mehr Infringement
* Erkenntnis: Infringement hat keinen festen Threshold, Kontext ist mehr entscheidend
* Datenbankgröße: ca 1:1 zur größe des git repositories

# TODO
* Welche Lizenzen sind relevant?

# QUELLEN:
* https://anonscm.debian.org/cgit/
* https://github.com/KDE
* https://github.com/GNOME/

