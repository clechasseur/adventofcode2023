(ns adventofcode.y2023.input.d5)

(def input
  {:seeds [432563865 39236501 1476854973 326201032 1004521373 221995697 2457503679 46909145 603710475 11439698 1242281714 12935671 2569215463 456738587 3859706369 129955069 3210146725 618372750 601583464 1413192]
   :maps [{:name :seed-to-soil
           :ranges [{:dest-range-start 2824905526 :source-range-start 2969131334 :range-size 898611144}
                    {:dest-range-start 0 :source-range-start 322319732 :range-size 9776277}
                    {:dest-range-start 379216444 :source-range-start 692683038 :range-size 140400417}
                    {:dest-range-start 3723516670 :source-range-start 1559827635 :range-size 9493936}
                    {:dest-range-start 637824014 :source-range-start 332096009 :range-size 211964909}
                    {:dest-range-start 929691047 :source-range-start 1569321571 :range-size 35824014}
                    {:dest-range-start 965515061 :source-range-start 1605145585 :range-size 1281263183}
                    {:dest-range-start 621118546 :source-range-start 833083455 :range-size 16705468}
                    {:dest-range-start 9776277 :source-range-start 0 :range-size 322319732}
                    {:dest-range-start 332096009 :source-range-start 544060918 :range-size 47120435}
                    {:dest-range-start 3733010606 :source-range-start 1319171816 :range-size 134731872}
                    {:dest-range-start 2329500810 :source-range-start 1453903688 :range-size 72388062}
                    {:dest-range-start 2401888872 :source-range-start 1526291750 :range-size 33535885}
                    {:dest-range-start 2246778244 :source-range-start 2886408768 :range-size 82722566}
                    {:dest-range-start 2435424757 :source-range-start 929691047 :range-size 389480769}
                    {:dest-range-start 519616861 :source-range-start 591181353 :range-size 101501685}]}

          {:name :soil-to-fertilizer
           :ranges [{:dest-range-start 2819195624 :source-range-start 2690204780 :range-size 252557843}
                    {:dest-range-start 1098298904 :source-range-start 1339121422 :range-size 10546957}
                    {:dest-range-start 499510245 :source-range-start 852292683 :range-size 97183057}
                    {:dest-range-start 4225167944 :source-range-start 2372810194 :range-size 69799352}
                    {:dest-range-start 887408376 :source-range-start 1808006977 :range-size 56225538}
                    {:dest-range-start 3071753467 :source-range-start 4058417302 :range-size 4632491}
                    {:dest-range-start 2455749676 :source-range-start 3452467754 :range-size 363445948}
                    {:dest-range-start 2243979338 :source-range-start 3846646964 :range-size 211770338}
                    {:dest-range-start 3076385958 :source-range-start 4063049793 :range-size 231917503}
                    {:dest-range-start 3860856553 :source-range-start 2269547568 :range-size 103262626}
                    {:dest-range-start 943633914 :source-range-start 21067281 :range-size 39980869}
                    {:dest-range-start 1388096097 :source-range-start 1584043708 :range-size 223963269}
                    {:dest-range-start 3493291351 :source-range-start 2442609546 :range-size 247595234}
                    {:dest-range-start 1801722612 :source-range-start 949475740 :range-size 41203502}
                    {:dest-range-start 264653767 :source-range-start 678191385 :range-size 102026845}
                    {:dest-range-start 3740886585 :source-range-start 2942762623 :range-size 89236706}
                    {:dest-range-start 1152866424 :source-range-start 310132079 :range-size 235229673}
                    {:dest-range-start 3830123291 :source-range-start 3815913702 :range-size 30733262}
                    {:dest-range-start 249083929 :source-range-start 1568473870 :range-size 15569838}
                    {:dest-range-start 1612059366 :source-range-start 1506703078 :range-size 61770792}
                    {:dest-range-start 366680612 :source-range-start 545361752 :range-size 132829633}
                    {:dest-range-start 1108845861 :source-range-start 1992124969 :range-size 44020563}
                    {:dest-range-start 596693302 :source-range-start 1048406348 :range-size 290715074}
                    {:dest-range-start 3467723121 :source-range-start 2243979338 :range-size 25568230}
                    {:dest-range-start 1879110833 :source-range-start 1349668379 :range-size 157034699}
                    {:dest-range-start 1858043552 :source-range-start 0 :range-size 21067281}
                    {:dest-range-start 3308303461 :source-range-start 3293048094 :range-size 159419660}
                    {:dest-range-start 3964119179 :source-range-start 3031999329 :range-size 261048765}
                    {:dest-range-start 983614783 :source-range-start 780218230 :range-size 72074453}
                    {:dest-range-start 1055689236 :source-range-start 1005796680 :range-size 42609668}
                    {:dest-range-start 1673830158 :source-range-start 1864232515 :range-size 127892454}
                    {:dest-range-start 1842926114 :source-range-start 990679242 :range-size 15117438}
                    {:dest-range-start 0 :source-range-start 61048150 :range-size 249083929}]}

          {:name :fertilizer-to-water
           :ranges [{:dest-range-start 0 :source-range-start 434502471 :range-size 470583313}
                    {:dest-range-start 1739362496 :source-range-start 1919893972 :range-size 48874906}
                    {:dest-range-start 2735409723 :source-range-start 1968768878 :range-size 16148586}
                    {:dest-range-start 3324522082 :source-range-start 1858151799 :range-size 61742173}
                    {:dest-range-start 4137416965 :source-range-start 1984917464 :range-size 25502361}
                    {:dest-range-start 470583313 :source-range-start 2971682591 :range-size 186824423}
                    {:dest-range-start 2751558309 :source-range-start 2532295557 :range-size 111781313}
                    {:dest-range-start 3664705516 :source-range-start 1340674299 :range-size 435773845}
                    {:dest-range-start 1851374390 :source-range-start 3898529330 :range-size 80666020}
                    {:dest-range-start 857422234 :source-range-start 2010419825 :range-size 207606184}
                    {:dest-range-start 1788237402 :source-range-start 2418040507 :range-size 63136988}
                    {:dest-range-start 1065028418 :source-range-start 0 :range-size 434502471}
                    {:dest-range-start 1499530889 :source-range-start 2481177495 :range-size 4578648}
                    {:dest-range-start 4162919326 :source-range-start 2916167530 :range-size 55515061}
                    {:dest-range-start 1670138099 :source-range-start 3158507014 :range-size 69224397}
                    {:dest-range-start 3386264255 :source-range-start 905085784 :range-size 278441261}
                    {:dest-range-start 2496170686 :source-range-start 3979195350 :range-size 239239037}
                    {:dest-range-start 4100479361 :source-range-start 2879229926 :range-size 36937604}
                    {:dest-range-start 1504109537 :source-range-start 3227731411 :range-size 166028562}
                    {:dest-range-start 657407736 :source-range-start 2218026009 :range-size 200014498}
                    {:dest-range-start 2909879036 :source-range-start 3393759973 :range-size 257495792}
                    {:dest-range-start 1932040410 :source-range-start 2644076870 :range-size 235153056}
                    {:dest-range-start 2167193466 :source-range-start 3651255765 :range-size 247273565}
                    {:dest-range-start 2863339622 :source-range-start 2485756143 :range-size 46539414}
                    {:dest-range-start 3167374828 :source-range-start 1183527045 :range-size 157147254}
                    {:dest-range-start 2414467031 :source-range-start 1776448144 :range-size 81703655}]}

          {:name :water-to-light
           :ranges [{:dest-range-start 894548549 :source-range-start 593866955 :range-size 6252040}
                    {:dest-range-start 3168871398 :source-range-start 327816880 :range-size 11668092}
                    {:dest-range-start 3549766643 :source-range-start 2935057349 :range-size 16258370}
                    {:dest-range-start 1070236274 :source-range-start 1304104659 :range-size 106353135}
                    {:dest-range-start 900800589 :source-range-start 723222576 :range-size 35881223}
                    {:dest-range-start 2175309976 :source-range-start 2744985745 :range-size 82677694}
                    {:dest-range-start 3969615926 :source-range-start 3819543751 :range-size 36919401}
                    {:dest-range-start 4086160816 :source-range-start 4015453657 :range-size 208806480}
                    {:dest-range-start 0 :source-range-start 360262147 :range-size 233604808}
                    {:dest-range-start 3566025013 :source-range-start 1514177176 :range-size 87956572}
                    {:dest-range-start 3440195928 :source-range-start 1874477761 :range-size 44575925}
                    {:dest-range-start 1851853101 :source-range-start 948479332 :range-size 113304167}
                    {:dest-range-start 2969520516 :source-range-start 3389635913 :range-size 199350882}
                    {:dest-range-start 1504406289 :source-range-start 1061783499 :range-size 137386237}
                    {:dest-range-start 623007058 :source-range-start 1630426233 :range-size 244051528}
                    {:dest-range-start 1749186436 :source-range-start 620555911 :range-size 102666665}
                    {:dest-range-start 2154532801 :source-range-start 339484972 :range-size 20777175}
                    {:dest-range-start 1965157268 :source-range-start 759103799 :range-size 189375533}
                    {:dest-range-start 4007153882 :source-range-start 3758595179 :range-size 60948572}
                    {:dest-range-start 3180539490 :source-range-start 2951315719 :range-size 231363953}
                    {:dest-range-start 233604808 :source-range-start 1471149229 :range-size 43027947}
                    {:dest-range-start 276632755 :source-range-start 1919053686 :range-size 114911374}
                    {:dest-range-start 1176589409 :source-range-start 0 :range-size 327816880}
                    {:dest-range-start 867058586 :source-range-start 1410457794 :range-size 27489963}
                    {:dest-range-start 391544129 :source-range-start 1199169736 :range-size 4581933}
                    {:dest-range-start 603082303 :source-range-start 600118995 :range-size 19924755}
                    {:dest-range-start 4068102454 :source-range-start 4276290379 :range-size 18058362}
                    {:dest-range-start 3810625421 :source-range-start 3856463152 :range-size 158990505}
                    {:dest-range-start 2969008355 :source-range-start 620043750 :range-size 512161}
                    {:dest-range-start 3758595179 :source-range-start 4224260137 :range-size 52030242}
                    {:dest-range-start 396126062 :source-range-start 3182679672 :range-size 206956241}
                    {:dest-range-start 4006535327 :source-range-start 4294348741 :range-size 618555}
                    {:dest-range-start 3484771853 :source-range-start 3588986795 :range-size 64994790}
                    {:dest-range-start 2257987670 :source-range-start 2033965060 :range-size 711020685}
                    {:dest-range-start 1641792526 :source-range-start 2827663439 :range-size 107393910}
                    {:dest-range-start 3411903443 :source-range-start 1602133748 :range-size 28292485}
                    {:dest-range-start 1037034802 :source-range-start 1437947757 :range-size 33201472}
                    {:dest-range-start 936681812 :source-range-start 1203751669 :range-size 100352990}
                    ]}

          {:name :light-to-temperature
           :ranges [{:dest-range-start 1726863959 :source-range-start 864157287 :range-size 834947717}
                    {:dest-range-start 263199301 :source-range-start 190436173 :range-size 53620398}
                    {:dest-range-start 1393417259 :source-range-start 1699105004 :range-size 333446700}
                    {:dest-range-start 2783912856 :source-range-start 244056571 :range-size 155961192}
                    {:dest-range-start 2939874048 :source-range-start 400017763 :range-size 299945457}
                    {:dest-range-start 671449939 :source-range-start 2517852185 :range-size 721967320}
                    {:dest-range-start 2561811676 :source-range-start 2295751005 :range-size 222101180}
                    {:dest-range-start 0 :source-range-start 2032551704 :range-size 263199301}
                    {:dest-range-start 481013766 :source-range-start 0 :range-size 190436173}
                    {:dest-range-start 316819699 :source-range-start 699963220 :range-size 164194067}]}

          {:name :temperature-to-humidity
           :ranges [{:dest-range-start 603287260 :source-range-start 3766826980 :range-size 8741130}
                    {:dest-range-start 572607531 :source-range-start 3684982838 :range-size 30679729}
                    {:dest-range-start 2084038135 :source-range-start 1101548002 :range-size 100083930}
                    {:dest-range-start 655933651 :source-range-start 3228345771 :range-size 56278566}
                    {:dest-range-start 1881393627 :source-range-start 553997241 :range-size 168332584}
                    {:dest-range-start 553997241 :source-range-start 2882185871 :range-size 18610290}
                    {:dest-range-start 627184746 :source-range-start 1072799097 :range-size 28748905}
                    {:dest-range-start 612028390 :source-range-start 3397056204 :range-size 15156356}
                    {:dest-range-start 1693489030 :source-range-start 1430646491 :range-size 187904597}
                    {:dest-range-start 3039118107 :source-range-start 1734352525 :range-size 2023479}
                    {:dest-range-start 220345266 :source-range-start 0 :range-size 43042720}
                    {:dest-range-start 840454312 :source-range-start 3775568110 :range-size 147781659}
                    {:dest-range-start 2184122065 :source-range-start 3715662567 :range-size 51164413}
                    {:dest-range-start 317040325 :source-range-start 171240045 :range-size 2422893}
                    {:dest-range-start 3245373536 :source-range-start 4158663426 :range-size 136303870}
                    {:dest-range-start 145773749 :source-range-start 385599932 :range-size 74571517}
                    {:dest-range-start 0 :source-range-start 43042720 :range-size 128197325}
                    {:dest-range-start 1490020808 :source-range-start 4094893831 :range-size 63769595}
                    {:dest-range-start 319463218 :source-range-start 173662938 :range-size 140708231}
                    {:dest-range-start 712212217 :source-range-start 1821839294 :range-size 128242095}
                    {:dest-range-start 128197325 :source-range-start 314371169 :range-size 17576424}
                    {:dest-range-start 2474405575 :source-range-start 3923349769 :range-size 171544062}
                    {:dest-range-start 2352890439 :source-range-start 3105028111 :range-size 121515136}
                    {:dest-range-start 3467140696 :source-range-start 3318936261 :range-size 78119943}
                    {:dest-range-start 2235286478 :source-range-start 3226543247 :range-size 1802524}
                    {:dest-range-start 4084196651 :source-range-start 722329825 :range-size 210770645}
                    {:dest-range-start 1553790403 :source-range-start 933100470 :range-size 139698627}
                    {:dest-range-start 1261006249 :source-range-start 1201631932 :range-size 229014559}
                    {:dest-range-start 263387986 :source-range-start 331947593 :range-size 53652339}
                    {:dest-range-start 3137034338 :source-range-start 2900796161 :range-size 108339198}
                    {:dest-range-start 988235971 :source-range-start 3412212560 :range-size 272770278}
                    {:dest-range-start 2237089002 :source-range-start 1618551088 :range-size 115801437}
                    {:dest-range-start 3381677406 :source-range-start 1736376004 :range-size 85463290}
                    {:dest-range-start 3545260639 :source-range-start 1950081389 :range-size 538936012}
                    {:dest-range-start 2049726211 :source-range-start 3284624337 :range-size 34311924}
                    {:dest-range-start 2645949637 :source-range-start 2489017401 :range-size 393168470}
                    {:dest-range-start 3041141586 :source-range-start 3009135359 :range-size 95892752}]}

          {:name :humidity-to-location
           :ranges [{:dest-range-start 596652260 :source-range-start 530461632 :range-size 95173962}
                    {:dest-range-start 3845096173 :source-range-start 1731990943 :range-size 158117085}
                    {:dest-range-start 2243878974 :source-range-start 1890108028 :range-size 393769632}
                    {:dest-range-start 0 :source-range-start 625635594 :range-size 63651375}
                    {:dest-range-start 1920725725 :source-range-start 753532949 :range-size 155684321}
                    {:dest-range-start 63651375 :source-range-start 329652856 :range-size 200808776}
                    {:dest-range-start 264460151 :source-range-start 0 :range-size 60175490}
                    {:dest-range-start 1381444473 :source-range-start 2283877660 :range-size 346420873}
                    {:dest-range-start 4003213258 :source-range-start 3594530530 :range-size 47694548}
                    {:dest-range-start 548036821 :source-range-start 60175490 :range-size 46076186}
                    {:dest-range-start 4100105147 :source-range-start 1678246429 :range-size 53744514}
                    {:dest-range-start 2637648606 :source-range-start 3642225078 :range-size 292412911}
                    {:dest-range-start 324635641 :source-range-start 106251676 :range-size 223401180}
                    {:dest-range-start 4050907806 :source-range-start 3545333189 :range-size 49197341}
                    {:dest-range-start 4153849661 :source-range-start 909217270 :range-size 141117635}
                    {:dest-range-start 3455132509 :source-range-start 3477799963 :range-size 67533226}
                    {:dest-range-start 594113007 :source-range-start 689286969 :range-size 2539253}
                    {:dest-range-start 2930061517 :source-range-start 2630298533 :range-size 525070992}
                    {:dest-range-start 753532949 :source-range-start 1050334905 :range-size 627911524}
                    {:dest-range-start 3522665735 :source-range-start 3155369525 :range-size 322430438}
                    {:dest-range-start 2076410046 :source-range-start 3934637989 :range-size 167468928}
                    {:dest-range-start 1727865346 :source-range-start 4102106917 :range-size 192860379}]}]})
