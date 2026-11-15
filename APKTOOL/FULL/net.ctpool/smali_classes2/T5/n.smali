.class public interface abstract LT5/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LT5/n$a;
    }
.end annotation


# static fields
.field public static final a:LT5/n;

.field public static final b:LT5/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LT5/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LT5/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LT5/n;->b:LT5/n$a;

    .line 8
    .line 9
    new-instance v0, LT5/n$a$a;

    .line 10
    .line 11
    invoke-direct {v0}, LT5/n$a$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LT5/n;->a:LT5/n;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public abstract a(LT5/u;Ljava/util/List;)V
.end method

.method public abstract d(LT5/u;)Ljava/util/List;
.end method
