# LangChain LCEL
# AI 작업을 하나의 파이프라인으로 만드는 방법

"""
invoke() -> PromptTemplate -> ChatOpenAI -> StrOutputParser
"""
import os
from dotenv import load_dotenv
from langchain_core.output_parsers import StrOutputParser
from langchain_core.prompts import PromptTemplate
from langchain_openai import ChatOpenAI

load_dotenv()

def build_chain():
    #1. API key 검증
    if not os.getenv("OPENAI_API_KEY"):
        raise ValueError(
            "OPENAI_API_KEY가 설정되어 있지 않습니다. .env파일을 작성해 주세요"
        )
    
if __name__ == "__main__":
    build_chain()