/*
 *
 * Copyright 2017 Nitrite author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.dizitart.no2.fulltext.languages;

import org.dizitart.no2.fulltext.Language;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Czech stop words
 *
 * @since 2.1.0
 * @author Anindya Chatterjee
 */
public class Czech implements Language {
    @Override
    public Set<String> stopWords() {
        return new HashSet<>(Arrays.asList(
                "a",
                "aby",
                "ahoj",
                "aj",
                "ale",
                "anebo",
                "ani",
                "aniž",
                "ano",
                "asi",
                "aspoåˆ",
                "aspoň",
                "atd",
                "atp",
                "az",
                "aäkoli",
                "ačkoli",
                "až",
                "bez",
                "beze",
                "blã­zko",
                "blízko",
                "bohuå¾el",
                "bohužel",
                "brzo",
                "bude",
                "budem",
                "budeme",
                "budes",
                "budete",
                "budeå¡",
                "budeš",
                "budou",
                "budu",
                "by",
                "byl",
                "byla",
                "byli",
                "bylo",
                "byly",
                "bys",
                "byt",
                "bä›hem",
                "být",
                "během",
                "chce",
                "chceme",
                "chcete",
                "chceå¡",
                "chceš",
                "chci",
                "chtã­t",
                "chtä›jã­",
                "chtít",
                "chtějí",
                "chut'",
                "chuti",
                "ci",
                "clanek",
                "clanku",
                "clanky",
                "co",
                "coz",
                "což",
                "cz",
                "daleko",
                "dalsi",
                "další",
                "den",
                "deset",
                "design",
                "devatenáct",
                "devatenã¡ct",
                "devä›t",
                "devět",
                "dnes",
                "do",
                "dobrã½",
                "dobrý",
                "docela",
                "dva",
                "dvacet",
                "dvanáct",
                "dvanã¡ct",
                "dvä›",
                "dvě",
                "dál",
                "dále",
                "dã¡l",
                "dã¡le",
                "dä›kovat",
                "dä›kujeme",
                "dä›kuji",
                "děkovat",
                "děkujeme",
                "děkuji",
                "email",
                "ho",
                "hodnä›",
                "hodně",
                "i",
                "jak",
                "jakmile",
                "jako",
                "jakož",
                "jde",
                "je",
                "jeden",
                "jedenáct",
                "jedenã¡ct",
                "jedna",
                "jedno",
                "jednou",
                "jedou",
                "jeho",
                "jehož",
                "jej",
                "jeji",
                "jejich",
                "jejã­",
                "její",
                "jelikož",
                "jemu",
                "jen",
                "jenom",
                "jenž",
                "jeste",
                "jestli",
                "jestliå¾e",
                "jestliže",
                "jeå¡tä›",
                "ještě",
                "jež",
                "ji",
                "jich",
                "jimi",
                "jinak",
                "jine",
                "jiné",
                "jiz",
                "již",
                "jsem",
                "jses",
                "jseš",
                "jsi",
                "jsme",
                "jsou",
                "jste",
                "já",
                "jã¡",
                "jã­",
                "jã­m",
                "jí",
                "jím",
                "jíž",
                "jšte",
                "k",
                "kam",
                "každý",
                "kde",
                "kdo",
                "kdy",
                "kdyz",
                "kdyå¾",
                "když",
                "ke",
                "kolik",
                "kromä›",
                "kromě",
                "ktera",
                "ktere",
                "kteri",
                "kterou",
                "ktery",
                "která",
                "kterã¡",
                "kterã©",
                "kterã½",
                "které",
                "který",
                "kteå™ã­",
                "kteři",
                "kteří",
                "ku",
                "kvå¯li",
                "kvůli",
                "ma",
                "majã­",
                "mají",
                "mate",
                "me",
                "mezi",
                "mi",
                "mit",
                "mne",
                "mnou",
                "mnä›",
                "mně",
                "moc",
                "mohl",
                "mohou",
                "moje",
                "moji",
                "moå¾nã¡",
                "možná",
                "muj",
                "musã­",
                "musí",
                "muze",
                "my",
                "má",
                "málo",
                "mám",
                "máme",
                "máte",
                "máš",
                "mã¡",
                "mã¡lo",
                "mã¡m",
                "mã¡me",
                "mã¡te",
                "mã¡å¡",
                "mã©",
                "mã­",
                "mã­t",
                "mä›",
                "må¯j",
                "må¯å¾e",
                "mé",
                "mí",
                "mít",
                "mě",
                "můj",
                "může",
                "na",
                "nad",
                "nade",
                "nam",
                "napiste",
                "napište",
                "naproti",
                "nas",
                "nasi",
                "naå¡e",
                "naå¡i",
                "načež",
                "naše",
                "naši",
                "ne",
                "nebo",
                "nebyl",
                "nebyla",
                "nebyli",
                "nebyly",
                "nechť",
                "nedä›lajã­",
                "nedä›lã¡",
                "nedä›lã¡m",
                "nedä›lã¡me",
                "nedä›lã¡te",
                "nedä›lã¡å¡",
                "nedělají",
                "nedělá",
                "nedělám",
                "neděláme",
                "neděláte",
                "neděláš",
                "neg",
                "nejsi",
                "nejsou",
                "nemajã­",
                "nemají",
                "nemáme",
                "nemáte",
                "nemã¡me",
                "nemã¡te",
                "nemä›l",
                "neměl",
                "neni",
                "nenã­",
                "není",
                "nestaäã­",
                "nestačí",
                "nevadã­",
                "nevadí",
                "nez",
                "neå¾",
                "než",
                "nic",
                "nich",
                "nimi",
                "nove",
                "novy",
                "nové",
                "nový",
                "nula",
                "ná",
                "nám",
                "námi",
                "nás",
                "náš",
                "nã¡m",
                "nã¡mi",
                "nã¡s",
                "nã¡å¡",
                "nã­m",
                "nä›",
                "nä›co",
                "nä›jak",
                "nä›kde",
                "nä›kdo",
                "nä›mu",
                "ní",
                "ním",
                "ně",
                "něco",
                "nějak",
                "někde",
                "někdo",
                "němu",
                "němuž",
                "o",
                "od",
                "ode",
                "on",
                "ona",
                "oni",
                "ono",
                "ony",
                "osm",
                "osmnáct",
                "osmnã¡ct",
                "pak",
                "patnáct",
                "patnã¡ct",
                "po",
                "pod",
                "podle",
                "pokud",
                "potom",
                "pouze",
                "pozdä›",
                "pozdě",
                "poå™ã¡d",
                "pořád",
                "prave",
                "pravé",
                "pred",
                "pres",
                "pri",
                "pro",
                "proc",
                "prostä›",
                "prostě",
                "prosã­m",
                "prosím",
                "proti",
                "proto",
                "protoze",
                "protoå¾e",
                "protože",
                "proä",
                "proč",
                "prvni",
                "první",
                "práve",
                "pta",
                "pä›t",
                "på™ed",
                "på™es",
                "på™ese",
                "pět",
                "před",
                "přede",
                "přes",
                "přese",
                "při",
                "přičemž",
                "re",
                "rovnä›",
                "rovně",
                "s",
                "se",
                "sedm",
                "sedmnáct",
                "sedmnã¡ct",
                "si",
                "sice",
                "skoro",
                "smã­",
                "smä›jã­",
                "smí",
                "smějí",
                "snad",
                "spolu",
                "sta",
                "sto",
                "strana",
                "stã©",
                "sté",
                "sve",
                "svych",
                "svym",
                "svymi",
                "své",
                "svých",
                "svým",
                "svými",
                "svůj",
                "ta",
                "tady",
                "tak",
                "take",
                "takhle",
                "taky",
                "takze",
                "také",
                "takže",
                "tam",
                "tamhle",
                "tamhleto",
                "tamto",
                "tato",
                "te",
                "tebe",
                "tebou",
                "ted'",
                "tedy",
                "tema",
                "ten",
                "tento",
                "teto",
                "ti",
                "tim",
                "timto",
                "tipy",
                "tisã­c",
                "tisã­ce",
                "tisíc",
                "tisíce",
                "to",
                "tobä›",
                "tobě",
                "tohle",
                "toho",
                "tohoto",
                "tom",
                "tomto",
                "tomu",
                "tomuto",
                "toto",
                "troå¡ku",
                "trošku",
                "tu",
                "tuto",
                "tvoje",
                "tvá",
                "tvã¡",
                "tvã©",
                "två¯j",
                "tvé",
                "tvůj",
                "ty",
                "tyto",
                "tä›",
                "tå™eba",
                "tå™i",
                "tå™inã¡ct",
                "téma",
                "této",
                "tím",
                "tímto",
                "tě",
                "těm",
                "těma",
                "těmu",
                "třeba",
                "tři",
                "třináct",
                "u",
                "uräitä›",
                "určitě",
                "uz",
                "uå¾",
                "už",
                "v",
                "vam",
                "vas",
                "vase",
                "vaå¡e",
                "vaå¡i",
                "vaše",
                "vaši",
                "ve",
                "vedle",
                "veäer",
                "večer",
                "vice",
                "vlastnä›",
                "vlastně",
                "vsak",
                "vy",
                "vám",
                "vámi",
                "vás",
                "váš",
                "vã¡m",
                "vã¡mi",
                "vã¡s",
                "vã¡å¡",
                "vå¡echno",
                "vå¡ichni",
                "vå¯bec",
                "vå¾dy",
                "více",
                "však",
                "všechen",
                "všechno",
                "všichni",
                "vůbec",
                "vždy",
                "z",
                "za",
                "zatã­mco",
                "zatímco",
                "zaä",
                "zač",
                "zda",
                "zde",
                "ze",
                "zpet",
                "zpravy",
                "zprávy",
                "zpět",
                "äau",
                "ätrnã¡ct",
                "ätyå™i",
                "å¡est",
                "å¡estnã¡ct",
                "å¾e",
                "čau",
                "či",
                "článek",
                "článku",
                "články",
                "čtrnáct",
                "čtyři",
                "šest",
                "šestnáct",
                "že"
        ));
    }
}
