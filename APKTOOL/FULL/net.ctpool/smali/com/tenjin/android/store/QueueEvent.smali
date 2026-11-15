.class public Lcom/tenjin/android/store/QueueEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private date:Ljava/util/Date;

.field private endpoint:Ljava/lang/String;

.field private id:I

.field private params:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDate()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEvent;->date:Ljava/util/Date;

    return-object v0
.end method

.method public getEndpoint()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEvent;->endpoint:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/tenjin/android/store/QueueEvent;->id:I

    return v0
.end method

.method public getParams()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/tenjin/android/store/QueueEvent;->params:Ljava/util/Map;

    return-object v0
.end method

.method public setDate(Ljava/util/Date;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEvent;->date:Ljava/util/Date;

    return-void
.end method

.method public setEndpoint(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEvent;->endpoint:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    iput p1, p0, Lcom/tenjin/android/store/QueueEvent;->id:I

    return-void
.end method

.method public setParams(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/tenjin/android/store/QueueEvent;->params:Ljava/util/Map;

    return-void
.end method
