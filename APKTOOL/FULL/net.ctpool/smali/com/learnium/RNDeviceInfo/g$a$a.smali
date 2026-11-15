.class Lcom/learnium/RNDeviceInfo/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/learnium/RNDeviceInfo/g$a;->invoke(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic m:I

.field final synthetic n:Lcom/learnium/RNDeviceInfo/g$a;


# direct methods
.method constructor <init>(Lcom/learnium/RNDeviceInfo/g$a;I)V
    .locals 0

    iput-object p1, p0, Lcom/learnium/RNDeviceInfo/g$a$a;->n:Lcom/learnium/RNDeviceInfo/g$a;

    iput p2, p0, Lcom/learnium/RNDeviceInfo/g$a$a;->m:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/learnium/RNDeviceInfo/g$a$a;->n:Lcom/learnium/RNDeviceInfo/g$a;

    iget v1, p0, Lcom/learnium/RNDeviceInfo/g$a$a;->m:I

    invoke-virtual {v0, v1}, Lcom/learnium/RNDeviceInfo/g$a;->d(I)V

    return-void
.end method
