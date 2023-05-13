package com.n.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "আমরা কোন দেশে বাস করি ?",
            arrayListOf("বাংলাদেশ", "আর্জেন্টিনা", "ব্রাজিল", "তুরস্ক"),
            0,
        )
        questionsList.add(questionOne)


        // 2
        val questionTwo = Question(
            2,
            "আমাদের জাতীয় ফল কি ?",
            arrayListOf("আম", "কলা",
                "কাঁঠাল", "লিচু"),
            2
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "আমাদের জাতীয় ফুল কী ?",
            arrayListOf("শাপলা", "গোলাপ",
                "গাঁদা", "ডালিয়া"),
            0
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "আমাদের জাতীয় পাখির নাম কি ?",
            arrayListOf("চড়ুই", "ঈগল",
                "কাক", "দোয়েল"),
            3
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "ফলের রাজা কোনটি ?",
            arrayListOf("আম", "কলা",
                "কাঁঠাল", "লিচু"),
            0
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "আমাদের জাতীয় খেলা কোনটি ?",
            arrayListOf("ক্রিকেট", "ফুটবল",
                "কাবাডি", "কোনোটিই নয়"),
            2
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "আমাদের জাতীয় মাছ কি ?",
            arrayListOf("সরপুঁটি", "পুটি",
                "কই", "ইলিশ"),
            3
        )
        questionsList.add(questionSeven)
        // 8
        val questioneight = Question(
            8,
            "আমাদের মাছের রাজা কি ?",
            arrayListOf("সরপুঁটি", "ইলিশ",
                "রুই", "কোনোটিই নয়"),
            1
        )
        questionsList.add(questioneight)

        val questionnine = Question(
            9,
            "ফুলের রাজা কোনটি ?",
            arrayListOf("শাপলা", "গোলাপ",
                "গাঁদা", "ডালিয়া"),
            1
        )
        questionsList.add(questionnine)

        val questionteen = Question(
            10,
            "বাংলাদেশ স্বাধীন হয় কত সালে ?",
            arrayListOf("১১৭১", "১৬৭১",
                "১৯৭১", "১৯৫২"),
            2
        )
        questionsList.add(questionteen)

        return questionsList
    }
}