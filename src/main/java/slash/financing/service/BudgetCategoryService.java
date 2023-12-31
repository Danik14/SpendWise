package slash.financing.service;

import slash.financing.data.BudgetCategory;
import slash.financing.data.User;
import slash.financing.dto.BudgetCategoryDto;

import java.util.List;
import java.util.UUID;

public interface BudgetCategoryService {
    BudgetCategory createPersonalBudgetCategory(BudgetCategoryDto budgetCategoryDto, User user);

    List<BudgetCategory> getDefaultBudgetCategories();

    boolean existsById(UUID id);

    List<BudgetCategory> getPersonalBudgetCategories(UUID id);

    BudgetCategory getBudgetCategoryById(UUID id);

    void deleteBudgetCategory(UUID id);

    BudgetCategory updateBudgetCategory(BudgetCategory budgetCategory, BudgetCategoryDto budgetCategoryUpdateDto);

}
