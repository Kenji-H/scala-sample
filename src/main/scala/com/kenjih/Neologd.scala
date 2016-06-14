package com.kenjih

import java.io.StringReader
import org.codelibs.neologd.ipadic.lucene.analysis.ja.JapaneseTokenizer
import org.codelibs.neologd.ipadic.lucene.analysis.ja.tokenattributes.BaseFormAttribute
import org.codelibs.neologd.ipadic.lucene.analysis.ja.tokenattributes.PartOfSpeechAttribute
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute

object Neologd {
  def main(args: Array[String]): Unit = {
    val tokenizer = new JapaneseTokenizer(null, true, JapaneseTokenizer.DEFAULT_MODE)

    val text = "ぱるるとこじはるとさや姉とゆきりん"
    tokenizer.setReader(new StringReader(text))
    val baseForm = tokenizer.addAttribute(classOf[BaseFormAttribute])
    val partOfSpeech = tokenizer.addAttribute(classOf[PartOfSpeechAttribute])
    val charTerm = tokenizer.addAttribute(classOf[CharTermAttribute])

    tokenizer.reset()
    while (tokenizer.incrementToken()) {
      println(charTerm.toString + '\t' + baseForm.getBaseForm() + '\t' + partOfSpeech.getPartOfSpeech())
    }
    tokenizer.close()    
  }
}
