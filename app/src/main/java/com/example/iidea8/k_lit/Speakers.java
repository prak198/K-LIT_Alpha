package com.example.iidea8.k_lit;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;


public class Speakers extends Fragment {
    private View view;
    private ArrayList<SpeakersBio> speakersBioArrayList = new ArrayList<SpeakersBio>();
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_speakers, container, false);
        listView = (ListView) view.findViewById(R.id.speakers_listview);
        SpeakersBio speakersBio = new SpeakersBio();
        //search






        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker1_abha_iyengar);
        speakersBio.setSpeakerName("Abha Iyengar");
        speakersBio.setSpeakerBio("An internationally published author, poet and British Council certified creative writing facilitator.Her poems have appeared in the Anthology of Contemporary Indian Poets and her fiction in The Indo-Australian Anthology of Short Fiction.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker2_aditya_bal);
        speakersBio.setSpeakerName("Aditya Bal");
        speakersBio.setSpeakerBio("A model/actor turned Chef, Aditya is one of the most recognized faces and has hosted slew ofsuccessful shows for the NDTV Goodtimes. He is finishing his first book on food and working on new show for the Epic Channel.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker3_advaita_kala);
        speakersBio.setSpeakerName("Advaita Kala");
        speakersBio.setSpeakerBio("A critical and commercial success, Advaita shot to fame with her witty classic, Almost Single.A hotelier by profession , she is also the literary brain behind Sujoy Gosh’s much acclaimed Kahani.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker4_ajay_jain);
        speakersBio.setSpeakerName("Ajay Jain");
        speakersBio.setSpeakerBio("An avid traveller, writer and owner of the Kuzum Café, in Hauz Khas Village,a travellars’s adda to share and converse travel tales over complimentary coffee and cookies.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker5_akshay_manwani);
        speakersBio.setSpeakerName("Akshay Manwani");
        speakersBio.setSpeakerBio("Having chucked away the corporate life, Akshay found his calling in literature. His first book Sahir Ludhianivi: A People’s Poet, was published by Harper Collins in 2013,and he is currently working on his third book on Nasir Hussain.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker6_alka_pande);
        speakersBio.setSpeakerName("Alka Pande");
        speakersBio.setSpeakerBio("Dr Pande is currently a Consultant Arts Advisor and Curator of the Visual Arts Gallery,India Habitat Centre. She has authored several well-acclaimed books, with a strong focus on Indian arts and ancient Indian erotic literature and aesthetics.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker7_ameena_saiyid);
        speakersBio.setSpeakerName("Ameena Saiyid");
        speakersBio.setSpeakerBio("She is the Managing Director of Oxford University Press in Pakistan and the founder of Karachi Literature Festival and Islamabad Literature Festival. In 2010, she became the first woman to be elected president of the 150-year-old Overseas Investors Chamber of Commerce and Industry (OICCI).");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker8_amit_shankar);
        speakersBio.setSpeakerName("Amit Shankar");
        speakersBio.setSpeakerBio("He has authored 4 national best sellers; Flight of the Hilsa, Chapter 11, Love is Vodka-A Shot Ain’t Enough and Café Latte. A coffee addict, an avid music buff and a great exponent of guitar, his genre includes rock, blues and jazz.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker9_aanchal_malhotra);
        speakersBio.setSpeakerName("Aanchal Malhotra");
        speakersBio.setSpeakerBio("She is a multimedia artist whose works explore the written word, photographic imagery and traditional printmaking. She is currently working on a project entitled, 'Remnants of a Separation' - a study of the material remains of the Partition of the Indian Subcontinent in 1947.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.speaker10_anuja_chauhan);
        speakersBio.setSpeakerName("Anuja Chauhan");
        speakersBio.setSpeakerBio("She is often described as \"the best writer of the Indian commercial fiction genre\".As a writer, she is best known for her best-selling contemporary 'rom-com' novels, The Zoya Factor, Battle For Bittora, Those Pricey Thakur Girls and The House That BJ Built.");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.asif_noorani);
        speakersBio.setSpeakerName("Asif Noorani ");
        speakersBio.setSpeakerBio("He is a former editor, senior columnist, author, book and music reviewer and a prominent Pakistani television personality. He is the author of Tales of Two Cities co-written with Kuldeep Nayar.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.barkhadutt);
        speakersBio.setSpeakerName("Barkha Dutt ");
        speakersBio.setSpeakerBio("She is Consulting Editor with NDTV, India's premier news network. Barkha is one of India's best-known journalists and the youngest to receive 'Padma Shri', one of India's highest State honours. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.basanta_rajkumar);
        speakersBio.setSpeakerName("Basanta Rajkumar ");
        speakersBio.setSpeakerBio("He is an officer of Indian Forest Services and is presently the Managing Director of Punjab Heritage and Tourism Promotion Board, Government of Punjab.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.bibek_debroy);
        speakersBio.setSpeakerName("Padam Shri Dr. Bibek Debroy ");
        speakersBio.setSpeakerBio("Dr. Debroy is a permanent member of NITI Aayog (National Institution for Transforming India Aayog. In 2010, he started authoring a ten-volume unabridged English translation of the Hindu epic The Mahabharata which concluded in 2014. ");
                speakersBioArrayList.add(speakersBio);






        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.chandan_mitra);
        speakersBio.setSpeakerName("Dr. Chandan Mitra ");
                speakersBio.setSpeakerBio("Dr. Mitra is an acclaimed Indian journalist, presently Editor and Managing Director of The Pioneer newspaper in Delhi, India. He was nominated as a member of the Rajya Sabha from August 2003 to August 2009. ");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.dan_hussain);
        speakersBio.setSpeakerName("Dan Husain ");
        speakersBio.setSpeakerBio("Danish aka Dan Husain is a poet, actor, theatre director, and a columnist. ");
                speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.deepa_agarwal);
        speakersBio.setSpeakerName("Deepa Agarwal ");
                speakersBio.setSpeakerBio("Author, poet, translator and storyteller, Deepa Agarwal writes for both children and adults and has over 50 books published. Her recent books are Rajula and the Web of Danger . ");
                        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.deepak_rawat);
        speakersBio.setSpeakerName("Deepak Rawat ");
                speakersBio.setSpeakerBio("Mr.Rawat is current District Magistrate of Nanital, he has studied from the Hans Raj college, DU and later did his MA and M. Phil. in history from JNU. He was also MD of Kumaon Mandal Vikas Nigam. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.deepti_pant);
        speakersBio.setSpeakerName("Deepti Pant ");
                speakersBio.setSpeakerBio("Deepti is Creative Storyteller who is actively engaged in reviving the lost art of storytelling, her inspiration is mostly from the rich mythological and historical text. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.devapriya_roy);
        speakersBio.setSpeakerName("Devpriya Roy");
        speakersBio.setSpeakerBio("She is a novelist and began her career with a witty and quirky novel The Vague Woman's Handbook. She has also authored The Weight Loss Club: The Curious Experiments of Nancy Housing Cooperative.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.dinesh_trivedi);
        speakersBio.setSpeakerName("Dinesh Trivedi");
        speakersBio.setSpeakerBio("Illustrious and articulate, Dinesh Trivedi is an Indian politician from the All India Trinamool Congress and current Member of Parliament in the Lower House representing Barrackpore, West Bengal.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.dolly_singh);
        speakersBio.setSpeakerName("Dolly Singh");
        speakersBio.setSpeakerBio("She is the founder of Poets Corner and Delhi Poetry Festival. Dolly is also the founder of New Leaf Poets Club that encourages young wordsmiths at school level and beyond.  ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.debasis_panigrahi);
        speakersBio.setSpeakerName("Dr. Panigrahi");
        speakersBio.setSpeakerBio("A popular and critically acclaimed writer of short stories, novel and novellas from Odisha. He is a member of Indian Police Service and is currently posted as an Inspector General of Police at State Police Headquarters,Cuttack. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.emuna_elon);
        speakersBio.setSpeakerName("Emuna Elon");
        speakersBio.setSpeakerBio("Emuna is an Israeli author, journalist and women's rights activist.  She has written three novels (one translated into English as \" If You Awaken Love\", a finalist for the 2007 National Jewish Book Award), and 17 children's books and works of nonfiction. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.fahad_samar);
        speakersBio.setSpeakerName("Fahad Samar ");
                speakersBio.setSpeakerBio("He is a director, film critic, columnist and author of the bestseller Scandal Point and Flash Point, the first two novels in his Mumbai trilogy, published by Harper Collins in 2014 and 2015.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.gayatri_chatterjee);
        speakersBio.setSpeakerName("Gayatri Chatterjee ");
                speakersBio.setSpeakerBio("She is an independent film scholar and has taught widely in many Universities in India and USA. Her forthcoming books are 'Love and Cinema...in India' and 'Sant Tukaram.' ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.geet_chaturvedi);
        speakersBio.setSpeakerName("Geet  Chaturvedi");
        speakersBio.setSpeakerBio("He is a Hindi poet and novelist, and was termed one of the 'Ten Best Writers' of India by the English daily Indian Express in 2011. His poems have been translated into eight languages. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.harish_chandra_singh_rawat);
        speakersBio.setSpeakerName("Harish Chandra Singh Rawat ");
                speakersBio.setSpeakerBio("Mr. Rawat is an Indian political leader and Chief Minister of state of Uttarakhand. He is a member of the Indian National Congress.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.jane_gill);
        speakersBio.setSpeakerName("Jane Gill");
        speakersBio.setSpeakerBio("Jane is an English author, her debut novel Dance with Fireflies is based upon the life of her Anglo-Indian grandmother who was a prolific letter writer. Jane is currently working on the sequel to Dance with Fireflies.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.janhavi_prasad);
        speakersBio.setSpeakerName("Janhavi Prasada ");
                speakersBio.setSpeakerBio("She is an Indian journalist and writer. Janhavi is currently writing a graphic novel on Mahatma Gandhi based on his autobiography –\" The Story of My Experiments With Truth\" to be published later this year by Harper Collins. She will be illustrating parts of the book as well. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.jeroninio_almeida);
        speakersBio.setSpeakerName("Jeronimo Almeida ");
        speakersBio.setSpeakerBio("Jerry as he is affectionately called is a Motivational  Speaker. He is much acclaimed as \"the moJOshInspirator\" and \"Karma  Guru for his leadership coaching or THE HERO IN ME .");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.jerry_pinto);
        speakersBio.setSpeakerName("Jerry Pinto ");
                speakersBio.setSpeakerBio("Jerry Is a novelist, journalist, poet and children’s writer. He is the author of A bear for Felicia (Puffin) and Mowgli and the Bear (Disney) and co-author with Garima Gupta of When Crows are White (Scholastic). ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.kanza_javed);
        speakersBio.setSpeakerName("Kanza Javed");
        speakersBio.setSpeakerBio("Kanza is a young Pakistani writer, her \"Ashes, Wine and Dust\" was short-listed for Tibor Jones South Asia Prize 2013, making her at the age of twenty-one, the youngest and the only Pakistani writer to do so.   ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.kiran_chaturvedi);
        speakersBio.setSpeakerName("Kiran Chaturvedi");
        speakersBio.setSpeakerBio("An experienced sociologist, qualitative consumer insight researcher, author and citizen activist, Kiran is sociologist by training. She is the founder of Write & Beyond, a creative writing facilitation workshop based out of Gurgaon. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.kiran_manral);
        speakersBio.setSpeakerName("Kiran Manral ");
                speakersBio.setSpeakerBio("Kiran is a former journalist and a writer, her debut novel, The Reluctant Detective, was published by Westland in 2012 and her second novel Once upon a Crush, was published by Leadstart in 2014. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.krishnakant_paul);
        speakersBio.setSpeakerName("Dr. Krishan Kant Paul ");
                speakersBio.setSpeakerBio("HE Dr. Paul is the 6th and current Governor of Uttarakhand. As a former officer of Indian Police Service he had previously served as Commissioner of Police, Delhi from February 2004 till retiring from service in July 2007. ");
                        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.kulpreet_yadav);
        speakersBio.setSpeakerName("Kulpreet Yadav ");
                speakersBio.setSpeakerBio("Kulpreet is a bestselling author, motivational speaker, and Founder-Editor of Open Road Review, an international literary magazine.  His forthcoming novel, 'The Girl who loved a Pirate', is India's first thriller based on marine piracy and hijacking. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.lovita_j_r_morang);
        speakersBio.setSpeakerName("Lovita J R Morang ");
                speakersBio.setSpeakerBio("A filmmaker, artiste and poet Lovita  is a versatile artist.  Her documentary film \" Discovery of Rhododendron Forest - where highest rhododendron grows\" was much appreciated and was an entrant in Green Oscars.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.madan_gopal_singh);
        speakersBio.setSpeakerName("Madan Gopal Singh ");
                speakersBio.setSpeakerBio("He is an Indian composer, singer, lyricist, actor, screenwriter, film theorist and editor. Madan has written and lectured extensively on cinema, art and cultural history besides performing the world over as a singer with his ensemble Chaaryaar. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.placeholder);
        speakersBio.setSpeakerName("M.K. Raina ");
                speakersBio.setSpeakerBio("He is one of India's best-known theatre actors and directors. Mr Raina has produced over 130 plays in 13 languages. He was also awarded one of India's highest theatre awards, the B.V. Karanth award for lifetime achievement in 2007. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.madhuja_mukherjee);
        speakersBio.setSpeakerName("Madhuja Mukherjee ");
                speakersBio.setSpeakerBio("Madhuja is an artist, writer, and filmmaker. She teaches Film Studies at Jadavpur University, Kolkata. She is the author of New Theatres Ltd., The Emblem of Art, The Picture of Success (2009), and has edited Aural Films, Oral Cultures (2012).");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mahesh_rao);
        speakersBio.setSpeakerName("Mahesh Rao ");
        speakersBio.setSpeakerBio("Mahesh is writer of short stories and a novelist.  He was born and grew up in Nairobi, Kenya. His debut novel, 'The Smoke Is Rising', won the Tata First Book Award for fiction and was shortlisted for the Shakti Bhatt First Book Prize and the Crossword Prize.  ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.maitreyee_b_chowdhury);
        speakersBio.setSpeakerName("Maitreyee B Chowdhury ");
                speakersBio.setSpeakerBio("Maitreyee is a Bangalore based poet and writer. She has two books to her credit- 'Uttam Kumar and Suchitra Sen: Bengali Cinema's First Couple' and 'Where Even the Present is Ancient: Benaras'.  ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mariam_karim_ahlawat);
        speakersBio.setSpeakerName("Mariam Karim Ahlawat");
        speakersBio.setSpeakerBio("Novelist, playwright, and children's author Mariam Karim has been a university teacher of French language and literature. Her novels and plays have been nominated for International and Indian awards.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.manjiri_prabhu);
        speakersBio.setSpeakerName("Manjiri Prabhu ");
                speakersBio.setSpeakerBio("Manjiri is a Pune-based English Author, Film-maker and Lit Fest Founder/Director. Labelled 'Desi Agatha Christie', Dr. Prabhu has published 8 books till date, two of which have been published by Bantam/Dell USA. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.maya_mirchandani);

        speakersBio.setSpeakerName("Maya Mirchandani ");
        speakersBio.setSpeakerBio("Maya is Senior Editor, Foreign Affairs Editor and a Senior Anchor at NDTV. In a career spanning two decades , she has reported on a range of issues-from environment to crime, from national politics to human rights and conflict to her real forte, world affairs. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.menka_shivdasani);
        speakersBio.setSpeakerName("Menka Shivdasani ");
        speakersBio.setSpeakerBio("Menka is the author of three collections of poetry. She is co-translator of Freedom and Fissures, an anthology of Sindhi Partition poetry (Sahitya Akademi). She has also edited an online anthology of contemporary Indian writing. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mihir_vatsa);
        speakersBio.setSpeakerName("Mihir Vatsa ");
        speakersBio.setSpeakerBio("Mihir is much acclaimed poet and winner of many awards. His first book of poetry, Painting That Red Circle White, was termed a \" must read of 2014\" by The Sunday Guardian.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mrinal_pande);
        speakersBio.setSpeakerName("Dr. Mrinal Pande ");
                speakersBio.setSpeakerBio("Dr. Pande is a writer, columnist, broadcaster and television presenter.  She was the editor of the popular women's magazine Vama from 1984-87. She is the executive editor of the Hindi daily Hindustan. She writes in both Hindi and English. ");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mona);
        speakersBio.setSpeakerName("Mona Verma ");
        speakersBio.setSpeakerBio("Recipient of the Uttarakhand Ratna 2014, Haridwar based writer Mona is the author of three acclaimed works of fiction 'A Bridge to Nowhere', 'God is a River…a story of faith', and 'The White Shadow.'");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.namita_gokhale);
        speakersBio.setSpeakerName("Namita Gokhale");
        speakersBio.setSpeakerBio("Namita  is a prolifc writer of six novels, a collection of short stories, and several works of nonfiction. She is the founder-director of Jaipur Literature Festival along with the author, William Dalrymple, which started in 2006. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.neha_prasada);
        speakersBio.setSpeakerName("Neha Prasada ");
                speakersBio.setSpeakerBio("Neha is the author of the book `Dining With The Maharajas’ . She has worked for the Times of India, The India Today Group and Network 18’s CNN IBN.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.placeholder);

        speakersBio.setSpeakerName("Nirav Sanghavi ");
        speakersBio.setSpeakerBio("Nirav is the founder and CEO of BlogAdda.com  which ranks as one of the top 20 brands in India and is the largest community of bloggers in India. For two consecutive years, 2009 and 2010, BlogAdda was Official Partner of the Blog World and New Media Expo held in Las Vegas. ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.olivier_lafont);
        speakersBio.setSpeakerName("Olivier Lafont ");
                speakersBio.setSpeakerBio("Oliver is a media personality who writes fiction, feature film screenplays, and editorial pieces and also acts in feature films, endorses some of India's most popular brands on television, and lends his voice to various media in many languages.  ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.osama_jalali);
        speakersBio.setSpeakerName("Osama Jalali ");
                speakersBio.setSpeakerBio("Osama is a seasoned food critic, Festival curator, consultant & an authority on Mughalia cuisine. His social media group Lost Recipes of India is one of the most popular groups on the subject. He has also consulted Oberoi group of hotels. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.pervaiz_alam	);
        speakersBio.setSpeakerName("Pervaiz Alam ");
                speakersBio.setSpeakerBio(" Mr. Alam is a renowned broadcast journalist. Working as a Senior Producer, he spent more than 15 years with the BBC in London.  He is currently Professor & Dean at the School of Journalism and Mass Communication,  ApeejayStya University. ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.piyush_jha);
        speakersBio.setSpeakerName("Piyush Jha ");
        speakersBio.setSpeakerBio("Piyush is an acclaimed film director, ad filmmaker and the author of bestselling crime-fiction novels Mumbaistan, Compass Box Killer and the recently released Anti Social that explore the gritty, noir landscape of crime fiction in Mumbai.  ");
                speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.pragnya_wakhlu);
        speakersBio.setSpeakerName("Pragnya Wakhlu ");
        speakersBio.setSpeakerBio("Pragnya is an award winning singer, song writer and guitarist from India. She is also the front woman of the Pune-based band \" Soul Strings\". She is two time nominee for 'Best female Vocalist' at the Jack Daniel's Rock Awards.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.placeholder);
        speakersBio.setSpeakerName("Pratap Somvanshi ");
        speakersBio.setSpeakerBio("Pratap is senior Journalist and poet, he is presently Resident Editor of Hindi daily, Hindustan’s Delhi edition. He is well known for his elegant and politically loaded poetry and ghazals. ");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.priyakapoor);
        speakersBio.setSpeakerName("Priya Kapoor ");
        speakersBio.setSpeakerBio("Priya is the current director of Roli books. She started her career in journalism with Indian Express. She has successfully commissioned and edited both mass market successes as well as award winning titles for Roli. ");
                speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.priyanka_singh_jha);
        speakersBio.setSpeakerName("Priyanka Singh Jha ");
                speakersBio.setSpeakerBio("Priyanka is an Indian journalist and in a career spanning over 15 years, she has written on varied subjects such as entertainment, art, business, crime, trends and celebrities and their lifestyles. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.purabi_sridhar);
        speakersBio.setSpeakerName("Purabi Sridhar ");
        speakersBio.setSpeakerBio("A Journalist for over two decades, she has worked with Indian Express, Sunday Mail and Femina. She has written a book on the cuisine of North East,The Seven Sisters, Kitchen Tales from the North East. ");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rajat_kapoor);
        speakersBio.setSpeakerName("Rajat Kapoor");
        speakersBio.setSpeakerBio("Rajat  is an actor, theatre personality and director. He has acted in many successful films like Dil Chahta Hai, Monsoon Wedding, Corporate and Bheja Fry. His latest directorial venture \" Aankhon Dekhi\", garnered much critical acclaim.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rajdeep_sardesai);
        speakersBio.setSpeakerName("Rajdeep Sardesai");
        speakersBio.setSpeakerBio("One of India's most respected journalists, Rajdeep Sardesai has nearly three decades of journalistic experience in print and TV. He has been the founder- editor in chief of IBN 18 network, which included CNN IBN. Prior to setting up the IBN network, he was the managing editor of NDTV 24 x 7 and NDTV India. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rakhshanda);
        speakersBio.setSpeakerName("Dr. Rakhshanda Jalil ");
        speakersBio.setSpeakerBio("Dr. Jalil is a writer, critic, translator and literary historian. She has published over 15 books and written over 50 academic papers and essays on a range of subjects: culture, society, faith and literature. She writes Op-eds for the Indian Express on a regular basis. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.randeep_surjewala);
        speakersBio.setSpeakerName("Randeep Surjewala ");
        speakersBio.setSpeakerBio(" Mr. Surjewala is an Indian politician and a member of Indian National Congress party. He is an MLA in the Haryana state legislature and a former minister. ");
                speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.ravikant);
        speakersBio.setSpeakerName("Ravikant");
        speakersBio.setSpeakerBio("He is a bilingual historian, writer, and translator based in CSDS, Delhi. Ravikant read, researched, and taught modern Indian and world history in various colleges of Delhi University before joining the Sarai programme at CSDS at its inception in 2000.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.ravi_dhingra);
        speakersBio.setSpeakerName("Ravi Dhingra");
        speakersBio.setSpeakerBio("Ravi is a Canon Photo Mentor and also a visiting faculty for photography at various Institutes including National Institute of Fashion Technology. He is also a Co-Founder of a photography based organisation called, CameraUnlimited Foundation.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rishi_suri);
        speakersBio.setSpeakerName("Rishi Suri ");
        speakersBio.setSpeakerBio("Rishi is a senior editor covering international affairs at The Daily Milap, India's oldest and largest circulated Urdu daily newspaper. He is an internationally recognised journalist known for his strong views and opinions on global politics and diplomacy. ");
                speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rosemary_fox);
        speakersBio.setSpeakerName("Rosemary Fox");
        speakersBio.setSpeakerBio("Rosemary is  an English conservationist and nature enthusiast  based in Canda, she has been closely associated with British Columbian conservation movement for over 40 years. She was born in Lansdowne, and shares a deep emotional bond with Kumaon.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rs_bedi);

        speakersBio.setSpeakerName("R S Bedi ");
        speakersBio.setSpeakerBio("He is a distinguished and decorated Army Personnel and retired from the Indian Government as Secretary and Founding Chairman of NTRO (National Technical Research Organisation. Kanwar Mohinder Singh Bedi \" Sahar\" the popular Urdu poet was his uncle.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.rutu_modan);
        speakersBio.setSpeakerName("Rutu Modan ");
        speakersBio.setSpeakerBio("Rutu is an Israeli illustrator and comic book artist. She is co-founder of the Israeli comics group Actus Tragicus and published the critically acclaimed graphic novels Exit Wounds (2007) and The Property (2013). ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.saif);
        speakersBio.setSpeakerName("Saif Mahmood");
        speakersBio.setSpeakerBio("Saif is a New Delhi-based lawyer holding a doctorate in Comparative Constitutional Law in South Asia. He speaks and writes on diverse issues ranging from law to literature and is associated in different capacities with a number of academic, legal, professional and literary organizations around the world.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.santosh_desai);
        speakersBio.setSpeakerName("Santosh Desai");
        speakersBio.setSpeakerBio("MD & CEO of Futurebrands India Limited, Santosh is one of India's best-known social commentators. He is author of 'City City Bang Bang', a weekly column in The Times of India that looks at contemporary Indian society from an everyday vantage point. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sarah_blau);
        speakersBio.setSpeakerName("Sarah Blau");
        speakersBio.setSpeakerBio("Sarah is widely acclaimed Hebrew writer and theatre artist. Blau has edited and presented several TV programs dealing with contemporary views on religion and feminism in the Orthodox community.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sathya_saran);
        speakersBio.setSpeakerName("Sathya Saran ");
        speakersBio.setSpeakerBio("Sathya is a senior journalist and author of biography on Guru Dutt . In the past, Sathya has edited Femina and been on the Board of governors of the NIFT. She is currently also Adjutant Professor at NIFT.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.satyarth);
        speakersBio.setSpeakerName("Satyarth Nair ");
        speakersBio.setSpeakerBio("Satyarth is an author & script-writer. His short story Eve won the British Council Writers Circle Prize in 2006, while in 2011 two of his stories were featured in Westland's Chicken Soup for the Soul series. ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.saurav_jha);
        speakersBio.setSpeakerName("Saurav Jha ");
        speakersBio.setSpeakerBio("Saurav is a commentator on energy and security. His first book, The Upside Down Book of Nuclear Power, was published by HarperCollins in March 2010 . Currently Jha is writing a techno-thriller Ayni as well as a quirky travelogue, The Heat and Dust Project.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.shekhar_pathak);
        speakersBio.setSpeakerName("Dr. Shekhar Pathak ");
        speakersBio.setSpeakerBio("Dr. Pathak is renowned historian from Uttarakhand, who was awarded the Padma Shri in 2007 and was Professor of History at Kumaun University in Nainital for the two decades. Once every decade, he has undertaken a padayatra, better known as Askot-Aarakot Abhiyan (AAA).");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.shiv_shankar);
        speakersBio.setSpeakerName("Shiv Shankar");
        speakersBio.setSpeakerBio("An culinary writer and television and theatre director, Shiv  is the author of The Brahmin Butcher. As a marketing & communications specialist he worked with several Fortune 500 companies such as Microsoft, Hewlett Packard, Nokia, and Siemens in their brand building days.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.siddhartha_gigoo);
        speakersBio.setSpeakerName("Siddharth Gigoo");
        speakersBio.setSpeakerBio("Siddharth is the author of two books of fiction, The Garden of Solitude (2011) and A Fistful of Earth and Other Stories (2015), which was longlisted for the Frank O’Connor International Short Story Award 2015.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sonali_misra);
        speakersBio.setSpeakerName("Sonali Misra");
        speakersBio.setSpeakerBio("Sonali is an editor at Scholastic India, the leading publisher of children's literature in the country. She formally started her career in 2013 at Macmillan Publishing Services, and interned at Penguin Books India and Comic Con India. Presently, she is working on her first novel.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sonia_singh);
        speakersBio.setSpeakerName("Sonia Verma Singh ");
                speakersBio.setSpeakerBio("Sonia is the Editorial Director of the news channel NDTV. As an anchor of the award winning programme for the Best Presented Show India Decides, she currently anchors the new weekly series, The NDTV Dialogues.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sudeep_sen);
        speakersBio.setSpeakerName("Sudeep Sen ");
                speakersBio.setSpeakerBio("Sen is widely recognised as a major new generation voice in world literature and 'one of the finest younger English-language poets in the international literary scene. His poems, translated into twenty-five languages, have featured in major international anthologies.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.suhail_mathur);
        speakersBio.setSpeakerName("Suhail Mathur ");
        speakersBio.setSpeakerBio("Suhail is an editor, literary agent and the author of the bestselling historical-mythological fiction, The Bhairav Putras. He has been awarded with Tales Pensieve's Best Book Reviewer Award, 2013.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.suhel_seth);
        speakersBio.setSpeakerName("Suhel Seth ");
        speakersBio.setSpeakerBio("Suhel is an Indian entrepreneur, actor, columnist, social activist and author. He is the founder of Counselage. As a writer he has penned, In your Face which is collection of his commentaries and essays full of dry wit and humour, which is his trademark. ");
                speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sujata_parashar);
        speakersBio.setSpeakerName("Sujata Parashar");
        speakersBio.setSpeakerBio("Sujata is a novelist, poet, short story writer and activist. She is currently on the executive board of Empowering Minds, a national level NGO located in Delhi. ");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sumantji);
        speakersBio.setSpeakerName("Sumant Batra");
        speakersBio.setSpeakerBio("Sumant  is a corporate and policy lawyer of global eminence, writer, poet, museum curator and a creative entrepreneur. He is the founder of Kumaon Literary Festival.");
        speakersBioArrayList.add(speakersBio);



        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sumedha_verma_ojha);
        speakersBio.setSpeakerName("Sumedha Verma Ojha ");
        speakersBio.setSpeakerBio("A former bureaucrat, Sumedha is author of historical fiction,  Urnabhih - A Mauryan tale of espionage, adventures and seduction.  She now lives on the shores of Lac Léman in Switzerland with her husband and two children.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.placeholder);
        speakersBio.setSpeakerName("Sumit G. Sehgal ");
                speakersBio.setSpeakerBio("Sumit is an international wordsmith with a literary experience spanning eleven years with twenty-nine e-books in tow. He has also has been nominated for Rex Global Fellowship.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.surender_mohan_pathak);
        speakersBio.setSpeakerName("Surender Mohan Pathak");
        speakersBio.setSpeakerBio("He is a much celebrated author of Hindi-language crime fiction with nearly 300 novels to his credit. He is also an ardent creator and collector of jokes which has been published in Joke Books, 26 in total.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.susy_mathew);
        speakersBio.setSpeakerName("Susy Mathew");
        speakersBio.setSpeakerBio("Susy is author of two historical fiction set in antiquity. Her debut novel- In a Bubble of Time, spans 14BC to 28AD. The second novel Elijah-Among the Shades of Times, is set in 9th century BC.  ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.syed_ali_hamid);
        speakersBio.setSpeakerName("Syed Ali Hamid ");
        speakersBio.setSpeakerBio("Prof Hamid is currently Prof of English Literature at the Almora Campus of Kumaon University, he has long association with poetry and translation of classics of English literature in Urdu.");
        speakersBioArrayList.add(speakersBio);





        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.sohail_hashmi);
        speakersBio.setSpeakerName("Sohail Hashmi");
        speakersBio.setSpeakerBio("He is a  journalist and broadcaster and former Director of Leap Years - a Creative Activity Centre for Children and a founding trustee of SAHMAT.  He conducts extremely popular heritage walks in Delhi and is deeply interested in the history of Delhi.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.tarun_thakral);
        speakersBio.setSpeakerName("Tarun Thakral");
        speakersBio.setSpeakerBio("Tarun founded Heritage Transportation Trust (HTT), and opened India's first comprehensive transport museum: Heritage Transport Museum, built on a 3 acre complex, it is located in Gurgaon, Haryana");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.tisca_chopra);
        speakersBio.setSpeakerName("Tisca Chopra ");
        speakersBio.setSpeakerBio(" Tisca is a contemporary actor in the Indian film industry, theatre personality and author, best known for her role in Taare Zameen Par and Firaaq and recent TV show 24 by Anil Kapoor .");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.vandana_bist);
        speakersBio.setSpeakerName("Vandana Bist ");
        speakersBio.setSpeakerBio("Vandana is an Illustrator, writer and children's author too. As an illustrator she has worked for magazines, poetry collections, brochures and related commercial literature.");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.mahesh_rao);
        speakersBio.setSpeakerName("Vani Mahesh");
        speakersBio.setSpeakerBio("Vani  is the founder of EasyLib, the first online library in India (started in 2001). She is a consultant writer with Amar Chitra Katha and a literary reviewer with Deccan Herald and other magazines. ");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.vikram_sampath);
        speakersBio.setSpeakerName("Vikram Sampath ");
        speakersBio.setSpeakerBio(" Bangalore based historian Vikram Sampath is the author of three acclaimed works of non-fiction \"Splendours of Royal Mysore: the untold story of the Wodeyars\", \"My name is Gauhar Jaan!- the life and times of a musician' and \"Voice of the Veena: S Balachander, a biography\". ");
        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.vinita_dawra_nangia);
        speakersBio.setSpeakerName("Vinita Dawra Nangia ");
                speakersBio.setSpeakerBio(" Vinita is a Columnist, Author, Senior Editor of The Times of India and a Motivational Speaker. She is the Director of Write India, a Times of India initiative to give 11 budding writers an opportunity to get a book published in their name.  ");
                        speakersBioArrayList.add(speakersBio);


        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.vipin_choudhary);
        speakersBio.setSpeakerName("Vipin Choudhary");
        speakersBio.setSpeakerBio("Vipin is a poet, writer and translator. She is continuously active in writing for radio drama, theatre, and films. Currently, she is vice-president of Manav Adhikhaar Sangh, an NGO working for preservation of Human Rights. ");
        speakersBioArrayList.add(speakersBio);

        speakersBio = new SpeakersBio();
        speakersBio.setSpeakerPhoto(R.mipmap.placeholder);
        speakersBio.setSpeakerName("Yaseen Anwar");
        speakersBio.setSpeakerBio("Yaseen is a young polyglot Indian poet. He founded ‘Kaafiya: The Poetry Festival’ and is its current director. He is also the Founder of Poets Corner Group,and Co-founder of Delhi Poetry Festival, in the year 2013.");
        speakersBioArrayList.add(speakersBio);




        listView.setAdapter(new SpeakersAdapter(getActivity().getBaseContext(), speakersBioArrayList));
        return view;
    }
    @Override
    public void onResume() {
        super.onResume();
        MyApplication.getInstance().trackScreenView("Speakers");
    }

}
