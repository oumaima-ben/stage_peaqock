package com.example.json.mapper;

import com.example.json.dto.*;
import com.example.json.entity.*;
import jakarta.ws.rs.ext.ParamConverter;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Lazy;

import java.util.List;
@Lazy
@Mapper(componentModel = "spring")
public interface FormMapper {
    FormMapper INSTANCE = Mappers.getMapper(FormMapper.class);

    ParentFormDto parentToDto(ParentForm parentForm);
    List<ParentFormDto> parentToparentAllDtos(List<ParentForm> parentForms);
    ParentForm  dtoToParent(ParentFormDto parentFormDto);
    ChildrenFormDto childrenToDto(ChildrenForm childrenForm);
    List<ChildrenFormDto> childrenTchildrenAllDtos(List<ChildrenFormDto> authors);
    ChildrenForm dtoToChildren(ChildrenFormDto childrenFormDto);
    Option dtoToOption(OptionDto optionDto);
    OptionDto optionToDto(Option option);
    QuestionDto questionToDto(Question question);
    Question dtoToQuestion(QuestionDto questionDto);
    List<QuestionDto> questionsToquestionAllDtos(List<Question> authors);
    void updateFromDto(ParentFormDto parentFormDto, @MappingTarget ParentForm parentForm);
    List<ExtrasDto> extrasToextraAllDtos(List<Extras> extras);
    List<OptionDto>  optionTooptionAllDtos(List<Option> options);
    Extras dtoToExtras(ExtrasDto extrasDto);
    ExtrasDto extraToDto(Extras extras);


}