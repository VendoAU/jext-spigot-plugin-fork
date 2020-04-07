package me.tajam.jext.command.tab;

import java.util.ArrayList;
import java.util.List;

public class CompletorFloat implements Completor {

  private Float[] suggestedValues;

  public CompletorFloat(Float[] suggestedValues) {
    this.suggestedValues = suggestedValues;
  }

  @Override
  public List<String> onComplete(String parameter) {
    if (parameter.isEmpty()) {
      List<String> suggestions = new ArrayList<>();
      for (Float value : suggestedValues) {
        suggestions.add(value.toString());
      }
      return suggestions;
    }
    return null;
  }

}