package com.codingshuttle.mayurtutorial.tutorial.services;

import com.codingshuttle.mayurtutorial.tutorial.dto.EmployeeDTO;
import com.codingshuttle.mayurtutorial.tutorial.entities.EmployeeEntity;
import com.codingshuttle.mayurtutorial.tutorial.repositories.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;

    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmployeeById(Long id){
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return modelMapper.map(employeeEntity,EmployeeDTO.class);
    }

    public EmployeeDTO createNewemployee(EmployeeDTO employeeDTO) {
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        return modelMapper.map(employeeRepository.save(employeeEntity),EmployeeDTO.class);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                                .stream()
                                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
                                .collect(Collectors.toList());
    }

    // -----------------------OR Instead This you can use Loop like ------------------------------
     /*   public List<EmployeeDTO> getAllEmployees() {
            List<EmployeeDTO> list = new ArrayList<>();
            for (EmployeeEntity employeeEntity : employeeRepository.findAll()) {
                EmployeeDTO map = modelMapper.map(employeeEntity, EmployeeDTO.class);
                list.add(map);
            }
            return list;
        }
     */
    public boolean deleteEmployeeById(long id) {
        boolean isPresent = employeeRepository.existsById(id);
        if(!isPresent)return false;
        employeeRepository.deleteById(id);
        return true;
    }
}
