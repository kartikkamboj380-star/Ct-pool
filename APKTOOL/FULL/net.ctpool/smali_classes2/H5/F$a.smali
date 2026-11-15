.class public final LH5/F$a;
.super Lm5/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH5/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lm5/e;->l:Lm5/e$b;

    sget-object v1, LH5/F$a$a;->m:LH5/F$a$a;

    invoke-direct {p0, v0, v1}, Lm5/b;-><init>(Lm5/g$c;Lv5/l;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LH5/F$a;-><init>()V

    return-void
.end method
