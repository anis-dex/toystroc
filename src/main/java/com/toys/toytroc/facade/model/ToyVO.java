package com.toys.toytroc.facade.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ToyVO
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-26T13:16:13.014Z")

public class ToyVO {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("categoryVO")
  private CategoryVO categoryVO = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("photoUrls")
  @Valid
  private List<String> photoUrls = new ArrayList<String>();

  @JsonProperty("tagVOS")
  @Valid
  private List<TagVO> tagVOS = null;

  /**
   * pet status in the store
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    PENDING("pending"),
    
    SOLD("sold");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public ToyVO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ToyVO category(CategoryVO categoryVO) {
    this.categoryVO = categoryVO;
    return this;
  }

  /**
   * Get categoryVO
   * @return categoryVO
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CategoryVO getCategoryVO() {
    return categoryVO;
  }

  public void setCategoryVO(CategoryVO categoryVO) {
    this.categoryVO = categoryVO;
  }

  public ToyVO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "doggie", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ToyVO photoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public ToyVO addPhotoUrlsItem(String photoUrlsItem) {
    this.photoUrls.add(photoUrlsItem);
    return this;
  }

  /**
   * Get photoUrls
   * @return photoUrls
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(List<String> photoUrls) {
    this.photoUrls = photoUrls;
  }

  public ToyVO tags(List<TagVO> tagVOS) {
    this.tagVOS = tagVOS;
    return this;
  }

  public ToyVO addTagsItem(TagVO tagsItem) {
    if (this.tagVOS == null) {
      this.tagVOS = new ArrayList<TagVO>();
    }
    this.tagVOS.add(tagsItem);
    return this;
  }

  /**
   * Get tagVOS
   * @return tagVOS
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TagVO> getTagVOS() {
    return tagVOS;
  }

  public void setTagVOS(List<TagVO> tagVOS) {
    this.tagVOS = tagVOS;
  }

  public ToyVO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * pet status in the store
   * @return status
  **/
  @ApiModelProperty(value = "pet status in the store")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToyVO toyVO = (ToyVO) o;
    return Objects.equals(this.id, toyVO.id) &&
        Objects.equals(this.categoryVO, toyVO.categoryVO) &&
        Objects.equals(this.name, toyVO.name) &&
        Objects.equals(this.photoUrls, toyVO.photoUrls) &&
        Objects.equals(this.tagVOS, toyVO.tagVOS) &&
        Objects.equals(this.status, toyVO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, categoryVO, name, photoUrls, tagVOS, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToyVO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    categoryVO: ").append(toIndentedString(categoryVO)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    tagVOS: ").append(toIndentedString(tagVOS)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

