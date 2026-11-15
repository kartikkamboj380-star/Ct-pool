.class public final Lw1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw1/x$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/c$a;
    }
.end annotation


# static fields
.field public static final a:Lw1/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw1/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw1/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw1/c;->a:Lw1/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
