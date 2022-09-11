FROM public.ecr.aws/m6n4d7c2/sigpwned/aws-lambda-java-base-image:17.0.3-al2

COPY target/demo-0.0.1-aws.jar "${LAMBDA_TASK_ROOT}/lib/"

CMD [ "org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest" ]