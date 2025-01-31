package io.praecepta.rules.dto;

import java.util.Collection;

public class MultiConditionGroupInfo {

    private String ruleGroupName;
    private RuleSpaceInfo ruleSpaceInfo;

    private Collection<MultiConditionCriteriaInfo> multiConditionCriteriaInfos;

    public Collection<MultiConditionCriteriaInfo> getMultiConditionCriteriaInfos() {
        return multiConditionCriteriaInfos;
    }

    public void setMultiConditionCriteriaInfos(Collection<MultiConditionCriteriaInfo> multiConditionCriteriaInfos) {
        this.multiConditionCriteriaInfos = multiConditionCriteriaInfos;
    }

    public String getRuleGroupName() {
        return ruleGroupName;
    }

    public void setRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
    }

    public RuleSpaceInfo getRuleSpaceInfo() {
        return ruleSpaceInfo;
    }

    public void setRuleSpaceInfo(RuleSpaceInfo ruleSpaceInfo) {
        this.ruleSpaceInfo = ruleSpaceInfo;
    }
}
