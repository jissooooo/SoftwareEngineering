# dynamodb.tf 파일 예시
resource "aws_dynamodb_table" "my_project_table" {
  name           = "ProjectData"
  billing_mode   = "PAY_PER_REQUEST"
  hash_key       = "ID"

  attribute {
    name = "ID"
    type = "S"
  }
}