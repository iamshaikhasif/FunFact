package com.example.funfactthemesapplication.ui.viewModel

import androidx.lifecycle.ViewModel

class WelcomeViewModel: ViewModel() {

    val dogsFactList = listOf<String>(
        "Evidence from fossils suggests that five types of dog had evolved by the Bronze Age, around 4500BC. These were mastiffs, wolf-type dogs, dogs similar to greyhounds, pointing dogs and herding dogs. Bow wow!",
        "Dogs also have fantastic hearing! They can detect high-pitched noises and spot sounds from much further away than humans can.",
        "Some working dogs are trained to use their super senses to sniff out explosives and illegal goods, or alert humans to potentially dangerous health issues. Wow!",
        "Dead rulers were often buried with their doggy pals, as they believed the hounds would protect them from harm in the afterlife."
    )

    val catFactList = listOf<String>(
        "Whisker Fatigue: Cats' whiskers are highly sensitive and can detect changes in air currents. This sensitivity helps them navigate in the dark. However, if a cat's whiskers touch the sides of a narrow space, they might feel uncomfortable or stressed.",
        "Purring Mysteries: While cats often purr when content, they also purr when injured or in pain. Scientists believe that purring may have healing properties, as the frequency of a cat's purr has been shown to promote the healing of bones and tissues.",
        "Flexible Spines: Cats have an incredibly flexible spine, which allows them to twist and turn their bodies in mid-air, landing on their feet. This ability is known as the \"righting reflex.\"",
        "Night Vision: Cats have excellent night vision, thanks to their large corneas and pupils that can open widely in low light. Their eyes also have a layer of cells called tapetum lucidum, which reflects light and enhances their ability to see in low-light conditions."
    )


    fun getFacts(type:String) : String {
        var facts = ""
        facts = when(type) {
            "Cat" -> {
                catFactList.random()
            }
            "Dog" -> {
                dogsFactList.random()
            }
            else -> {
                "not found"
            }
        }

        return facts
    }

}