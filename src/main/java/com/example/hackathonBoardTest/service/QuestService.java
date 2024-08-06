package com.example.hackathonBoardTest.service;

import com.example.hackathonBoardTest.dto.QuestRequestsDto;
import com.example.hackathonBoardTest.dto.QuestResponseDto;
import com.example.hackathonBoardTest.dto.SuccessResponseDto;
import com.example.hackathonBoardTest.entity.Quest;
import com.example.hackathonBoardTest.repository.QuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestService {
    private final QuestRepository boardRepository;

    @Transactional(readOnly = true)
    public List<QuestResponseDto> getQuests() {
        return boardRepository.findAllByOrderByModifiedAtDesc().stream().map(QuestResponseDto::new).toList();
    }

    @Transactional
    public QuestResponseDto createQuest(QuestRequestsDto requestsDto) {
        Quest quest = new Quest(requestsDto);

        /*
        퀘스트 코드 설정
        1번 : 방 청소 하기
        2번 : 집 앞 1000보 산책
        3번 : 50페이지 이상 독서
        4번 : 마음에 드는 드라마 시청
         */
        quest.setContents((int) (Math.random()*4));

        boardRepository.save(quest);
        return new QuestResponseDto(quest);
    }

    @Transactional
    public QuestResponseDto getQuest(long id) {
        return boardRepository.findById(id).map(QuestResponseDto::new).orElseThrow(
                () -> new IllegalArgumentException("퀘스트가 존재하지 않습니다.")
        );
    }

    @Transactional
    public QuestResponseDto updateQuest(Long id, QuestRequestsDto requestsDto) throws Exception {
        Quest quest = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("퀘스트가 존재하지 않습니다.")
        );

        if (!requestsDto.getAuthor().equals(quest.getAuthor()))
            throw new Exception("유저가 일치하지 않습니다.");

        quest.update(requestsDto);
        return new QuestResponseDto(quest);
    }

    @Transactional
    public SuccessResponseDto deleteQuest(Long id, QuestRequestsDto requestsDto) throws Exception {
        Quest quest = boardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("아이디가 존재하지 않습니다.")
        );

        if (!requestsDto.getAuthor().equals(quest.getAuthor()))
            throw new Exception("비밀번호가 일치하지 않습니다.");

        boardRepository.deleteById(id);
        return new SuccessResponseDto(true);
    }
}
