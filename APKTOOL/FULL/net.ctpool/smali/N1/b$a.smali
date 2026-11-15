.class final LN1/b$a;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LN1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final m:LN1/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LN1/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LN1/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN1/b$a;->m:LN1/b$a;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lw5/l;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a()Landroidx/core/util/e;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/util/e;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/core/util/e;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LN1/b$a;->a()Landroidx/core/util/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
