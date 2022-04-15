package com.naijaState

import com.naijaState.data.model.State

private const val  BASE_URL = "https://192.168.43.53:8080"
val states = mutableListOf<State>(
    State(
        "Abia",
        "Abi",
        "Umuahia",
        "Okezie Ikpeazu",
        "Abia State (Igbo: Ȯha Abia) is a state in the South-East geopolitical zone of Nigeria, bordered to the north and northeast by the states of Anambra, Enugu, and Ebonyi, Imo State to the west, Cross River State to the east, Akwa Ibom State to the southeast, and Rivers State to the south. It takes its name from the acronym for four of the state's most populated regions: Aba, Bende, Isuikwuato, and Afikpo",
        3720000,
        "Gods own state",
        "south-east",
        1992
    ),
    State(
        "Adamawa",
        "Adam",
        "Yola",
        "Ahmadu Fintiri",
        "Adamawa State is a state in the North-East geopolitical zone of Nigeria, bordered by Borno to the northwest, Gombe to the west, and Taraba to the southwest while its eastern border forms part of the national border with Cameroon. It takes its name from the historic emirate of Adamawa, with the emirate's old capital of Yola serving as the capital city of Adamawa State. The state—one of the most heterogeneous in Nigeria with over 100 indigenous ethnic groups—was formed in 1991 when the former Gongola State was broken up into Adamawa and Taraba states",
        4250000,
        "Land of Beauty",
        "North-East",
        1991
    ),

    State(
        "Akwa_Ibom",
        "Akb",
        "Uyo",
        "Udom Emmanuel",
        "Akwa Ibom State is a state in the South-South geopolitical zone of Nigeria, bordered on the east by Cross River State, on the west by Rivers State and Abia State, and on the south by the Atlantic Ocean. The state takes its name from the Kwa Ibo River which bisects the state before flowing into the Bight of Bonny",
        5500000,
        "Land of Promise",
        "South_South",
        1987
    ),

    State(
        "Anambra",
        "Anm",
        "Awka",
        "Charles Soludo",
        "Anambra State is a Nigerian state, located in the southeastern region of the country.According to the 2006 census report there are over 4.1 million residents in the state.[4] The state name was formed in 1976 from the former East Central State, the state is named after Omambala River, a river that runs through the state",
        4000000,
        "light of the nation",
        "south-east",
        1991
    ),

    State(
        "Bauchi",
        "Bau",
        "Bauchi",
        "Bala Mohammed",
        "Bauchi State (Fula: Leydi Bauchi) is a state in the North-East geopolitical zone of Nigeria, bordered by Kano and Jigawa to the north, Taraba and Plateau to the south, Gombe and Yobe to the east, and Kaduna to the west. It takes its name from the historic town of Bauchi, which also serves as its capital city. The state was formed in 1976 when the former North-Eastern State was broken up. It originally included the area that is now Gombe State, which became a distinct state in 1996.",
        6530000,
        "pearl of tourism",
        "north-east",
        1976

    ),
    State(
        "Bayelsa",
        "Bay",
        "Yanagoa",
        "Douye Diri",
        "Bayelsa is one of the states in southern part of Nigeria, located in the core of the Niger Delta region. Bayelsa State was created in 1996 and was carved out from Rivers State, making it one of the newest states in the federation. It shares a boundary with Rivers State to the East and Delta State to the west, with the waters of the Atlantic Ocean dominating its southern borders",
        1704515,
        "Glory of all Lands",
        "South-South",
        1996
    ),
    State(
        "Benue",
        "Ben",
        "Makurdi",
        "Samuel Ortom",
        "Benue State is one of the North Central states in Nigeria with a population of about 4,253,641 in 2006 census. The state was created in 1976[4] among the 7 states created at that time.The state derives its name from the Benue River which is the second largest river in Nigeria",
        4253641,
        "food basket of the nation",
        "North-Central",
        1976
    ),
    State(
        "Borno",
        "Bor",
        "Maiduguri",
        "Babagana Umara Zulum ",
        "Borno State is a state in the North-East geopolitical zone of Nigeria, bordered by Yobe to the west, Gombe to the southwest, and Adamawa to the south while its eastern border forms part of the national border with Cameroon, its northern border forms part of the national border with Niger, and its northeastern border forms all of the national border with Chad, being the only Nigerian state to border three foreign countries. It takes its name from the historic emirate of Borno, with the emirate's old capital of Maiduguri serving as the capital city of Borno State",
        5860200,
        "Home of Peace",
        "North_East",
        1976
    ),
    State(
        "Cross River",
        "Crv",
        "Calabar",
        "Benedict Ayade",
        "Cross River State is a state in the South South geopolitical zone of Nigeria. Named for the Cross River, the state was formed from the eastern part of the Eastern Region on 27 May 1967. Its capital is Calabar, it borders to the north by Benue State, to the west by Ebonyi State and Abia State, and to the southwest by Akwa Ibom State while its eastern border forms part of the national border with Cameroon",
        3737517,
        "The People's Paradise",
        "South-South",
        1967
    ),
    State(
        "Delta",
        "Del",
        "Asaba",
        "Arthur Okowa Ifeanyi",
        "Delta State is a state in the South-South geopolitical zone of Nigeria. Named after the Niger Delta[4]—a large part of which is in the state—the state was formed from the former Bendel State in August 27, 1991. Bordered on the north by Edo State, the east by Anambra and Rivers states, and that south by Bayelsa State while to the west is the Bight of Benin which covers about 160 kilometres of the state's coastline",
        5663400,
        "The Big Heart",
        "South-South",
        1991
    ),
    State(
        "Ebonyi",
        "Ebo",
        "Abakiliki",
        "Dave Umahi",
        "Ebonyi State (Igbo: Ȯra Ebonyi) is a state in the South-East geopolitical zone of Nigeria, bordered to the north and northeast by Benue State, Enugu State to the west, Cross River State to the east and southeast, and Abia State to the southwest. Named for the Abonyi (Aboine) River—a large part of which is in the state's south—Ebonyi State was formed from parts of Abia and Enugu state in 1996 and has its capital as Abakaliki",
        3490383,
        "Salt of the nation",
        "South-East",
        1996
    ),
    State(
        "Edo",
        "Ed",
        "Benin City",
        "Godwin Obaseki",
        "Edo State is one of the 36 states of Nigeria, located in the southern region of the country.[4] As of 2006 National population census, the state was ranked as the 24th populated state (3,233,366) in Nigeria.[5] The state's capital and city, Benin City, is the fourth largest city in Nigeria, and the centre of the country's rubber industry",
        3233366,
        "Heart Beat of Nigeria",
        "South",
        1991
    ),
    State(
        "Ekiti",
        "Ekt",
        "Ado-Ekiti",
        "Kayode Fayemi",
        "Ekiti State (Yoruba: Ìpínlẹ̀ Èkìtì) is a state in southwestern Nigeria, bordered to the north by Kwara State, to the northeast by Kogi State, to the south and southeast by Ondo State, and to the west by Osun State. Named for the Ekiti people—the Yoruba subgroup that make up the majority of the state's population—Ekiti State was formed from a part of Ondo State in 1996 and has its capital as the city of Ado-Ekiti",
        2210957,
        "Land of Honour and Integrity",
        "South-West",
        1996
    ),
    State(
        "Enugu",
        "Enu",
        "Enugu",
        "Ifeanyi Ugwuanyi",
        "Enugu (/eɪˈnuːɡuː/ Igbo: Énugwú) is the capital of Enugu State in Nigeria. It is located in southeastern Nigeria. The city had a population of 722,664 according to the 2006 Nigerian census. The name Enugu is derived from the two Igbo words Énú Ụ́gwụ́, meaning hill top, denoting the city's hilly geography.",
        722644,
        "Coal City",
        "South_East",
        1991
    ),
    State(
        "Gombe",
        "Gom",
        "Gombe",
        "Muhammad Inuwa Yahaya",
        "Gombe State (Fula: Leydi Gombe) is a state in northeastern Nigeria, bordered to the north and northeast by the state of Borno and Yobe, to the south by Taraba State, to the southeast by Adamawa State, and to the west by Bauchi State. Named for the city of Gombe—the state's capital and largest city—Gombe State was formed from a part of Bauchi State on 1 October 1996",
        2365040,
        "Jewel of the Savannah",
        "North_East",
        1996
    ),
    State(
        "Imo",
        "Im",
        "Owerri",
        "Hope Uzodinma",
        "Imo State (Igbo: Ȯra Imo) is a state in the South-East geopolitical zone of Nigeria, bordered to the north by Anambra State, Rivers State to the east and south, and Abia State to the west.[5] It takes its name from the Imo River which flows along the state's eastern border",
        5400000,
        "Eastern Heartland",
        "South-East",
        1976
    ),
    State(
        "Jigawa",
        "Jig",
        "Dutse",
        "Badaru Abubakar",
        "Jigawa State (Hausa: Jihar Jigawa (fula leydi jigawa) is one of the 36 states of Nigeria, located in the northern region of the country. Created in 1991 from the northeastern-most region of Kano State, Jigawa State is located on the border with Nigeria's national border with the Republic of the Niger",
        4361002,
        "The NEw World",
        "North-East",
        1991

    ),
    State(
        "Kaduna",
        "Kd",
        "Kaduna",
        "Nasir El-Rufai",
        "Kaduna State (Hausa: Jihar Kaduna; Tyap: Sitet Kaduna) is a state in northern Nigeria. The state capital is its namesake, the city of Kaduna which happened to be the 8th largest city in the country as at 2006. Created in 1967 as North-Central State, which also encompassed the modern Katsina State, Kaduna State achieved its current borders in 1987. The fourth largest and third most populous state in the country",
        6113503,
        "Centre of Learning",
        "northern",
        1967
    ),
    State(
        "kano",
        "Kan",
        "Kano",
        "Abdullahi Umar Ganduje",
        "Kano State (Hausa: Jihar Kano) is one of the 36 states of Nigeria, located in the northern region of the country.[6] According to the national census done in 2006, Kano State is the most populous in Nigeria. The recent official estimates taken in 2016 by the National Bureau of Statistics found that Kano State was still the largest state by population in Nigeria",
        20000000,
        "Center of commerce",
        "norht",
        1967,
    ),
    State(
        "Kebbi",
        "Keb",
        "Birnin-Kebbi",
        "Abubakar Atiku Bagudu",
        "Kebbi State (Hausa: Jihar Kebbi) is a state in northwestern Nigeria, bordered to the east and north by the states of Sokoto and Zamfara, and to the south by Niger State while its western border forms part of the national borders with Benin Republic and Niger",
        3256541,
        "Land of Equity",
        "north-west",
        1991
    ),
    State(
        "Kogi",
        "Kog",
        "lokoja",
        "Yahaya Bello",
        "Kogi State is a state in the North Central region of Nigeria, bordered to the east by the states of Ekiti and Kwara, to the north by the Federal Capital Territory, to the northeast by Nasarawa State, to the northwest by Niger State, to the southwest by the states of Edo and Ondo, to the southeast by the states of Anambra and Enugu, and to the west by Benue State as being the only state in Nigeria to border ten other states",
        3314043,
        "The Confluence State",
        "north-central",
        1991
    ),
    State(
        "Kwara",
        "kwa",
        "illorin",
        "Abdulrazaq Abdulrahman",
        "Kwara State (Yoruba: Ìpínlẹ̀ Kwárà) is a state in Western Nigeria, bordered to the east by Kogi State, to the north by Niger State, and to the south by Ekiti, Osun, and Oyo states while its western border makes up part of the international border with Benin Republic",
        2365353,
        "State of Harmony",
        "west",
        1967
    ),
    State(
        "Lagos",
        "Lag",
        "Ikeja",
        "Babajide Sanwo-Olu",
        "Lagos State (Yoruba: Ìpínlẹ̀ Èkó) is a state in southwestern Nigeria. Of the 36 states, it is both the most populous and smallest in area. Bounded to the south by the Bight of Benin and to the west by the international border with Benin Republic, Lagos State borders Ogun State to the east and north making it the only Nigerian state to border only one other state",
        17552940,
        "Centre of Excellence",
        "South-west",
        1967,
    ),

    State(
        "Nasarawa",
        "Nas",
        "Lafia",
        "Abdullahi Sule",
        "Nasarawa State is a state in the North Central region of Nigeria, bordered to the east by the states of Taraba and Plateau, to the north by Kaduna State, to the south by the states of Kogi and Benue, and to the west by the Federal Capital Territory. Named for the historic Nasarawa Emirate",
        1869377,
        "Home of Solid Minerals",
        "North-Cebtral",
        1996,
    ),
    State(
        "Niger",
        "Nig",
        "Minna",
        "Abubakar Sani Bello",
        "Niger is a state in the North Central region of Nigeria and the largest state in the country. Niger state has three political zones, zone A,B and C. The state's capital is at Minna. Other major cities are Bida, Kontagora and Suleja.It was formed in 1976 when the then North-Western State was divided into Niger State and Sokoto State",
        3954772,
        "The Power State",
        "North-Central",
        1976,

        ),
    State(
        "Ogun",
        "Og",
        "Abeokuta",
        "Dapo Abiodun",
        "Ogun State is a state in southwestern Nigeria. Created in February 3, 1976 from the former Western State. Ogun State borders Lagos State to the south, Oyo State and Osun State to the north, Ondo State, and the Republic of Benin to the west. Abeokuta is both Ogun State's capital and most populous city; other important cities in the state include Ijebu Ode, the former royal capital of the Ijebu Kingdom, and Sagamu, Nigeria's leading kola nut grower",
        3751140,
        "Gateway State",
        "South-West",
        1976
    ),

    State(
        "Ondo",
        "Ond",
        "Akure",
        "Rotimi Akeredolu",
        "Ondo State is a state in southwestern Nigeria. It was Created in February 3, 1976 from the former Western State. Ondo State borders Ekiti State (formally part of the state) to the north, Kogi State to the northeast, Edo State to the east, Delta State to the southeast, Ogun State to the southwest, Osun State to the northwest, and The Atlantic Ocean to the south. The state's capital is Akure, the former capital of the ancient Akure Kingdom",
        3460877,
        "Sunshine State",
        "South-West",
        1976
    ),

    State(
        "Osun",
        "Osu",
        "Osogbo",
        "Adegboyega Oyetola",
        "Osun State (/ˈoʊʃuːn/; Yoruba: Ìpínlẹ̀ Ọ̀ṣun), occasionally known as the State of Osun by the state government, is a state in southwestern Nigeria; bounded to the east by Ekiti and Ondo states, to the north by Kwara State, to the south by Ogun State and to the west by Oyo State. Named for the River Osun—a vital river which flows through the state",
        4316959,
        "Land of Virtue",
        "South-West",
        1991
    ),
    State(
        "Oyo",
        "Oy",
        "Ibadan",
        "Seyi Makinde",
        "Ọyọ, usually referred to as Ọyọ State to distinguish it from the city of Oyo, is an inland state in southwestern Nigeria. Its capital is Ibadan, the third most populous city in the country and formerly the second most populous city in Africa.[7] Ọyọ State is bordered to the north by Kwara State, to the east by Osun State, and to the southwest by Ogun State and the Republic of Benin",
        7840864,
        "Pace Setter State",
        "South-West",
        1976,
    ),
    State(
        "Plateau",
        "Pla",
        "Jos",
        "Simon Bako Lalong",
        "Plateau is the twelfth-largest state in Nigeria. Approximately in the centre of the country, it is geographically unique in Nigeria due to its boundaries of elevated hills surrounding the Jos Plateau[5] its capital, and the entire plateau itself.Plateau State is celebrated as The Home of Peace and Tourism. With natural formations of rocks, hills and waterfalls, it derives its name from the Jos Plateau",
        3206531,
        "Home of Peace and Tourism",
        "North-Central",
        1976
    ),
    State(
        "Rivers",
        "Riv",
        "Port-Harcourt",
        "Nyesom Wike",
        "Rivers State, also known as Rivers, is a state in the Niger Delta region of southern Nigeria (Old Eastern Region[5]).[6] Formed in 1967, when it was split from the former Eastern Region, Rivers State borders includes; Anambra and Imo on the north, Abia and Akwa Ibom on the east, and Bayelsa and Delta on the west",
        5198716,
        "Treasure Base of the Nation",
        "South-South",
        1967
    ),
    State(
        "Sokoto",
        "Sok",
        "Sokoto",
        "Aminu Waziri Tambuwal",
        "Sokoto State is one of the 36 states of Nigeria, located in the extreme northwest of the country on the national border with the Republic of the Niger. Its capital and largest city is the city of Sokoto. Sokoto is located near to the confluence of the Sokoto River and the Rima River",
        3702676,
        "Seat of the Caliphate",
        "North-West",
        1976,
    ),
    State(
        "Taraba",
        "Tar",
        "Jalingo",
        "Darius Ishaku",
        "Taraba (fula: leydi taraba) is a state in North Eastern Nigeria, named after the Taraba River which traverses the southern part of the state. Taraba's capital is Jalingo. The inhabitants are mainly the Fulani, Jukun, Chamba,Tiv, Kuteb and the Ichen who are found predominantly in the southern part of the state while Wurkum, Mumuye, and Kona tribes are predominantly located in the northern part of the state. The central region is mainly occupied by the Mambila people, Chamba,Fulani and Jibawa. There are over 40 different tribes and their languages in Taraba State",
        2294800,
        "Nature Gift to the Nation",
        "North-East",
        1991
    ),
    State(
        "Yobe",
        "Yob",
        "Damatru",
        "Idi Barde Gubana",
        "Yobe is a state located in northeastern Nigeria. A mainly agricultural state. Yobe State was carved out of Borno State",
        2321339,
        "Pride Of the Sahel",
        "North-East",
        1991
    ),
    State(
        "Zamfara",
        "Zam",
        "Gusau",
        "Bello Mohammed Matawalle",
        "Zamfara is a state in northwestern Nigeria, Until 1996, the area was part of Sokoto State,Zamfara is a densely populated area with the Hausa and Fulani peoples.",
        9278873,
        "Farming is our Pride",
        "North-West",
        1996
    ),
    State(
        "Federal Capital Territory",
        "fct",
        "Abuja",
        "Mohammed Musa Bello",
        "The Federal Capital Territory, commonly known as FCT, is a federal territory in central Nigeria. Abuja, the capital city of Nigeria, is located in this territory. FCT was formed in 1976 from parts of the states of old Kwara, Niger, Kaduna and Plateau States with the bulk of landmass carved out of Niger State",
        1406239,
        "Centre of Unity",
        "North-Central",
        1976
    )

)