.class public final LA5/c$a;
.super LA5/c;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LA5/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LA5/c;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LA5/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 1
    invoke-static {}, LA5/c;->a()LA5/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LA5/c;->b()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method
