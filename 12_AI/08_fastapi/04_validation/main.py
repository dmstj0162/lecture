from typing import Annotated, Literal
from fastapi import FastAPI, Path, Query
from pydantic import BaseModel, ConfigDict, Field, field_validator

app = FastAPI(title="04. Validation")

@app.post("/examples/raw", tags=["comparison"])
async def accept_raw_json(payload: dict) -> dict:
    return{"received":payload, "warning": "내부 필드 검증 없음"}