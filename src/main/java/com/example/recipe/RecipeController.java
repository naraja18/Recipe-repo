package com.example.recipe;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.recipe.RecipeService;

@RestController
public class RecipeController {
    RecipeService apiService = new RecipeService();

    @GetMapping("/recipes")
    public ArrayList<Recipe> getRecipes() {
        return apiService.getAllRecipes();
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(@RequestBody Recipe recipe) {
        return apiService.addRecipe(recipe);
    }

    @GetMapping("/recipes/{recipeId}")
    public Recipe getRecipeById(@PathVariable("recipeId") int recipeId) {
        return apiService.getRecipeById(recipeId);
    }

    @PutMapping("/recipes/{recipeId}")
    public Recipe updatRecipe(@PathVariable("recipeId") int recipeId, @RequestBody Recipe recipe) {
        return apiService.updateRecipe(recipeId, recipe);
    }

    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId) {
        apiService.deleteRecipe(recipeId);
    }

}