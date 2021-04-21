package com.example.recyclerviewmovie;

import java.util.ArrayList;

public class DataSource {
    private static String[] MoviesName = {
            "Iron Man",
            "The Incredible Hulk",
            "Iron Man 2",
            "Thor",
            "Captain America: The First Avenger",
            "The Avengers",
            "Iron Man 3",
            "Thor: The Dark World",
            "Captain America: The Winter Soldier",
            "Guardians of The Galaxy",
            "Avengers: Age of Ultron",
            "Ant-Man"
    };

    private static String[] MoviesReleaseDate = {
            "May 2, 2008",
            "June 13, 2008",
            "May 7, 2010",
            "May 6, 2011",
            "July 22, 2011",
            "May 4, 2012",
            "May 3, 2013",
            "November 8, 2013",
            "April 4, 2014",
            "August 1, 2014",
            "May 1, 2015",
            "July 17, 2015"
    };

    private static String[] MoviesPlot = {
            "Tony Stark, who has inherited the defense contractor Stark Industries from his father Howard Stark, is in war-torn Afghanistan with his friend and military liaison, Lieutenant Colonel James Rhodes, to demonstrate the new \"Jericho\" missile. After the demonstration, the convoy is ambushed and Stark is critically wounded by a missile used by the attackers: one of his company's own. He is captured and imprisoned in a cave by a terrorist group called the Ten Rings. Yinsen, a fellow captive doctor, implants an electromagnet into Stark's chest to keep the shrapnel shards that wounded him from reaching his heart and killing him. Ten Rings leader Raza offers Stark freedom in exchange for building a Jericho missile for the group, but he and Yinsen know that Raza will not keep his word.",
            "At Culver University in Virginia, General Thaddeus \"Thunderbolt\" Ross meets with Dr. Bruce Banner, the colleague and boyfriend of his daughter Betty, regarding an experiment that Ross claims is meant to make humans immune to gamma radiation. The experiment—part of a World War II-era \"super-soldier\" program that Ross hopes to recreate—fails. The exposure to gamma radiation causes Banner to transform into the Hulk for brief periods of time, whenever his heart rate rises above 200 beats per minute. The Hulk destroys the lab and surrounding area, killing several people inside and injuring the General and Betty, and others outside. Banner becomes a fugitive from the U.S. military and Ross, who wants to weaponize the Hulk.",
            "In Russia, the media covers Tony Stark's disclosure of his identity as Iron Man. Ivan Vanko, whose father, Anton Vanko, a former Stark Industries employee, has just died, sees this and begins building a miniature arc reactor similar to Stark's. Six months later,[N 2] Stark is a superstar and uses his Iron Man suit for peaceful means, resisting government pressure to sell his designs. To continue the legacy of his father Howard, he reinstitutes the Stark Expo in New York City's Flushing Meadows–Corona Park.",
            "In 965 AD, Odin, king of Asgard, wages war against the Frost Giants of Jotunheim and their leader Laufey, to prevent them from conquering the nine realms, starting with Earth. The Asgardian warriors defeat the Frost Giants in Tønsberg, Norway, and seize the source of their power, the Casket of Ancient Winters. In the present, Odin's son Thor prepares to ascend to the throne of Asgard, but is interrupted when Frost Giants attempt to retrieve the Casket. Against Odin's order, Thor travels to Jotunheim to confront Laufey, accompanied by his brother Loki, childhood friend Sif and the Warriors Three: Volstagg, Fandral, and Hogun. A battle ensues until Odin intervenes to save the Asgardians, destroying the fragile truce between the two races. For Thor's arrogance, Odin strips his son of his godly power and exiles him to Earth as a mortal, accompanied by his hammer Mjölnir, now protected by an enchantment that allows only the worthy to wield it.",
            "In the present day, scientists in the Arctic uncover an old, frozen aircraft. In March 1942, Nazi lieutenant general Johann Schmidt and his men steal a mysterious relic called the Tesseract, which possesses untold godly powers, from the town of Tønsberg in German-occupied Norway. In New York City, Steve Rogers is rejected for World War II military recruitment due to his various health and physical problems. While attending an exhibition of future technologies with his best friend, Sgt. James \"Bucky\" Barnes, Rogers again attempts to enlist. Overhearing Rogers' conversation with Barnes about representing his country in the war, Dr. Abraham Erskine allows Rogers to enlist. He is recruited into the Strategic Scientific Reserve as part of a \"super-soldier\" experiment under Erskine, Colonel Chester Phillips, and British agent Peggy Carter. Phillips is unconvinced by Erskine's claims that Rogers is the right person for the procedure but relents after seeing Rogers jump on a grenade to save his comrades, unaware that it is a test. The night before the treatment, Erskine reveals to Rogers that Schmidt underwent the procedure prematurely and suffered permanent side-effects.",
            "The Asgardian Loki encounters the Other, the leader of an extraterrestrial race known as the Chitauri. In exchange for retrieving the Tesseract, a powerful energy source of unknown potential, the Other promises Loki an army with which he can subjugate Earth. Nick Fury, director of the espionage agency S.H.I.E.L.D., and his lieutenant Agent Maria Hill arrive at a remote research facility during an evacuation, where physicist Dr. Erik Selvig is leading a research team experimenting on the Tesseract. Agent Phil Coulson says that the object has begun radiating an unusual form of energy. The Tesseract suddenly activates and opens a wormhole, allowing Loki to reach Earth. Loki takes the Tesseract and uses his scepter to enslave Selvig and a few other agents, including Clint Barton, to aid him in his getaway. In response to the attack, Fury reactivates the \"Avengers Initiative\". Agent Natasha Romanoff heads to Kolkata to recruit Dr. Bruce Banner to trace the Tesseract through its gamma radiation emissions. Coulson visits Tony Stark to have him check Selvig's research, and Fury approaches Steve Rogers with an assignment to retrieve the Tesseract.",
            "At a New Year's Eve party in 1999, Tony Stark meets scientist Maya Hansen, the inventor of an experimental regenerative treatment named Extremis that allows recovery from crippling injuries. Disabled scientist Aldrich Killian offers them a place in his company Advanced Idea Mechanics, but Stark rejects him. In December 2012, seven months after the battle of New York, Stark is suffering from post-traumatic stress disorder and is having frequent panic and anxiety attacks due to his experiences during the alien invasion and subsequent battle. Restless, he has built dozens of new Iron Man suits to cope with his insomnia, creating friction with his girlfriend Pepper Potts.",
            "Eons ago, Bor, father of Odin, clashes with the Dark Elf Malekith, who seeks to unleash a weapon known as the Aether on the nine realms. After conquering Malekith's forces, including enhanced warriors called the Kursed, on their home world of Svartalfheim, Bor safeguards the Aether within a stone column. Unknown to Bor, Malekith, his lieutenant Algrim and a handful of Dark Elves escape into suspended animation. In present-day Asgard, Loki stands imprisoned for his war crimes on Earth.[N 1] Meanwhile, Thor, alongside warriors Fandral, Volstagg, and Sif, repels marauders on Vanaheim, home of their comrade Hogun; it is the final battle in a war to pacify the Nine Realms following the reconstruction of the Bifröst, the \"Rainbow Bridge\" between realms, which had been destroyed two years earlier. The Asgardians soon learn that the Convergence, a rare alignment of the Nine Realms, is imminent; as the event approaches, portals linking the worlds appear at random.",
            "Two years after the Battle of New York, Steve Rogers works in Washington, D.C., for the espionage agency S.H.I.E.L.D., while adjusting to contemporary society. During a mission alongside Agent Natasha Romanoff and S.H.I.E.L.D.'s counter-terrorism S.T.R.I.K.E. team, led by Agent Rumlow, to free hostages aboard a S.H.I.E.L.D. vessel from pirates led by Georges Batroc, Rogers discovers Romanoff has another agenda: to extract data from the ship's computers. Returning to the Triskelion, S.H.I.E.L.D.'s headquarters, Rogers confronts Director Nick Fury and is briefed about Project Insight: three Helicarriers linked to spy satellites, designed to preemptively eliminate threats. Unable to decrypt Romanoff's data, Fury becomes suspicious about Insight and asks senior S.H.I.E.L.D. official and Secretary of Internal Security Alexander Pierce to delay the project.",
            "In 1988, following his mother's death, a young Peter Quill is abducted from Earth by a group of alien thieves and smugglers called the Ravagers led by Yondu Udonta. Twenty-six years later on the abandoned planet Morag, Quill steals a mysterious orb, but is attacked by forces, led by Korath, of the fanatical Kree renegade, Ronan the Accuser. Although Quill escapes with the orb, Yondu discovers his theft and issues a bounty for his capture, while Ronan sends the assassin Gamora after the orb.",
            "In the Eastern European country of Sokovia, the Avengers—Tony Stark, Steve Rogers, Thor, Bruce Banner, Natasha Romanoff, and Clint Barton—raid a Hydra facility commanded by Baron Wolfgang von Strucker, who has experimented on humans using the scepter previously wielded by Loki. They meet two of Strucker's test subjects—twins Pietro (who has superhuman speed) and Wanda Maximoff (who has telepathic and telekinetic abilities)—and apprehend Strucker, while Stark retrieves Loki's scepter.",
            "In 1989, scientist Hank Pym resigns from S.H.I.E.L.D. after discovering their attempt to replicate his Ant-Man shrinking technology. Believing the technology would be dangerous if replicated, Pym vows to hide it for as long as he lives. In the present day,[N 1] Pym's estranged daughter, Hope van Dyne, and former protégé, Darren Cross, have forced him out of his company, Pym Technologies. Cross is close to perfecting a shrinking suit of his own, the Yellowjacket, which horrifies Pym."
    };

    private static int[] MoviesPoster = {
            R.drawable.iron_man,
            R.drawable.the_increcible_hulk,
            R.drawable.iron_man_2,
            R.drawable.thor_1,
            R.drawable.captain_america_the_first_avenger,
            R.drawable.the_avengers,
            R.drawable.iron_man_3,
            R.drawable.thor_the_dark_world,
            R.drawable.captain_america_the_winter_soldier,
            R.drawable.guardians_of_the_galaxy,
            R.drawable.avengers_age_of_ultron,
            R.drawable.ant_man
    };

    public static ArrayList<Movies> getListData() {
        ArrayList<Movies> list = new ArrayList<>();
        for (int position = 0; position < MoviesName.length; position++) {
            Movies movies = new Movies();
            movies.setName(MoviesName[position]);
            movies.setReleaseDate(MoviesReleaseDate[position]);
            movies.setPlot(MoviesPlot[position]);
            movies.setPoster(MoviesPoster[position]);
            list.add(movies);
        }
        return list;
    }
}
