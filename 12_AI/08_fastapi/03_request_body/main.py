from typing import Annotated

from fastapi import Body, FastAPI
from pydantic import BaseModel, Field

app = FastAPI(title="03 Request Body")

class ItemCreate(BaseModel):
    name: str = Field(min_length=1, max_length=50)
    description: str | None = None
    price: float = Field(gt=0)
    tax: float | None = Field(default=None, ge=0)

class UserInfo(BaseModel):
    """사용자 정보"""
    username: str = Field(min_length=2, max_length=30)
    full_name: str | None = None
@app.post("/items", tags=["simple-body"])
async def create_item(item: ItemCreate) -> dict:
    """Pydantic 모델 매개변수는 JSON Body로 해석된다."""
    result = item.model_dump()
    print("🍩" , result)
    return result

@app.put("/items/{item_id}", tags=["combined"])
async def update_item(
    item_id: int,
    item: ItemCreate,
    notify: bool = False,
) -> dict:
    return {"item_id": item_id, "item": item, "notify": notify}