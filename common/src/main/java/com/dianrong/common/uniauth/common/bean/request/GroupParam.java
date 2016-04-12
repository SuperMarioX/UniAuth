package com.dianrong.common.uniauth.common.bean.request;

import java.util.List;

public class GroupParam extends Operator {

	private Integer id;
	private String code;
	private String name;
	private String description;
	private Byte status;

	//when add
	private Integer targetGroupId;
	//when delete
	private List<Integer> targetGroupIds;
	//if true only group, ignore members under each group
	//if false, both group and members returned
	private Boolean onlyShowGroup;
	//if onlyShowGroup=false and userGroupType=0, then return members, if if onlyShowGroup=false and userGroupType=1 return owners
	private Byte userGroupType;

	private Boolean needOwnerMarkup;

	private Integer roleId;

	private Integer tagId;
	
	private Integer domainId;
	
	private List<Integer> roleIds;

	public Integer getId() {
		return id;
	}

	public GroupParam setId(Integer id) {
		this.id = id;
		return this;
	}

	public String getCode() {
		return code;
	}

	public GroupParam setCode(String code) {
		this.code = code;
		return this;
	}

	public String getName() {
		return name;
	}

	public GroupParam setName(String name) {
		this.name = name;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public GroupParam setDescription(String description) {
		this.description = description;
		return this;
	}

	public Byte getStatus() {
		return status;
	}

	public GroupParam setStatus(Byte status) {
		this.status = status;
		return this;
	}

	public Integer getTargetGroupId() {
		return targetGroupId;
	}

	public GroupParam setTargetGroupId(Integer targetGroupId) {
		this.targetGroupId = targetGroupId;
		return this;
	}

	public Boolean getOnlyShowGroup() {
		return onlyShowGroup;
	}

	public GroupParam setOnlyShowGroup(Boolean onlyShowGroup) {
		this.onlyShowGroup = onlyShowGroup;
		return this;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public GroupParam setRoleId(Integer roleId) {
		this.roleId = roleId;
		return this;
	}

	public Integer getDomainId() {
		return domainId;
	}

	public GroupParam setDomainId(Integer domainId) {
		this.domainId = domainId;
		return this;
	}

	public List<Integer> getRoleIds() {
		return roleIds;
	}

	public GroupParam setRoleIds(List<Integer> roleIds) {
		this.roleIds = roleIds;
		return this;
	}

	public Byte getUserGroupType() {
		return userGroupType;
	}

	public GroupParam setUserGroupType(Byte userGroupType) {
		this.userGroupType = userGroupType;
		return this;
	}

	public Boolean getNeedOwnerMarkup() {
		return needOwnerMarkup;
	}

	public GroupParam setNeedOwnerMarkup(Boolean needOwnerMarkup) {
		this.needOwnerMarkup = needOwnerMarkup;
		return this;
	}

	public List<Integer> getTargetGroupIds() {
		return targetGroupIds;
	}

	public GroupParam setTargetGroupIds(List<Integer> targetGroupIds) {
		this.targetGroupIds = targetGroupIds;
		return this;
	}

	public Integer getTagId() {
		return tagId;
	}

	public GroupParam setTagId(Integer tagId) {
		this.tagId = tagId;
		return this;
	}
}
