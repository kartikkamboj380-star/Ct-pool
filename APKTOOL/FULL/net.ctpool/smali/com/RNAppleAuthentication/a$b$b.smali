.class final Lcom/RNAppleAuthentication/a$b$b;
.super Lcom/RNAppleAuthentication/a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/RNAppleAuthentication/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/RNAppleAuthentication/a$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "code"

    return-object v0
.end method
