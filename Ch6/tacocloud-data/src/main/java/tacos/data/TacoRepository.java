package tacos.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import tacos.Taco;


public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
    //PagingAndSortingRepository 인터페이스를 확장해서 DesignController -> /recent 에서 findAll() 메서드를 사용가능하다
}
